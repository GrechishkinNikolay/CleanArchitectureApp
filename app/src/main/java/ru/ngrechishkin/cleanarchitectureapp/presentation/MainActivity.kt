package ru.ngrechishkin.cleanarchitectureapp.presentation

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import ru.ngrechishkin.cleanarchitectureapp.R

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.e("MyT", "Main activity created")

        viewModel = ViewModelProvider(
            this,
            MainViewModelFactory(applicationContext)
        ).get(MainViewModel::class.java)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditText = findViewById<TextView>(R.id.dataEditText)
        val getDataButton = findViewById<TextView>(R.id.getDataButton)
        val saveDataButton = findViewById<TextView>(R.id.saveDataButton)

        viewModel.liveData.observe(this, Observer() { text ->
            dataTextView.text = text
        })

        saveDataButton.setOnClickListener {
            val name = dataEditText.text.toString()
            viewModel.save(name)
        }

        getDataButton.setOnClickListener {
            viewModel.load()
        }

    }
}