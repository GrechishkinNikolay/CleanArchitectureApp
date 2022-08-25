package ru.ngrechishkin.cleanarchitectureapp.presentation

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import ru.ngrechishkin.cleanarchitectureapp.R
import ru.ngrechishkin.cleanarchitectureapp.data.repository.UserRepositoryImpl
import ru.ngrechishkin.cleanarchitectureapp.data.storage.sharedPrefs.SharedPrefUserDAO
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSaveDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase

class MainActivity : AppCompatActivity() {

    private val userRepository by lazy(LazyThreadSafetyMode.NONE) {UserRepositoryImpl(SharedPrefUserDAO(applicationContext))}
    private val getUserNameUseCase by lazy(LazyThreadSafetyMode.NONE) {GetUserNameUseCase(userRepository)}
    private val saveUserNameUseCase by lazy(LazyThreadSafetyMode.NONE) {SaveUserNameUseCase(userRepository)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataTextView = findViewById<TextView>(R.id.dataTextView)
        val dataEditText = findViewById<TextView>(R.id.dataEditText)
        val getDataButton = findViewById<TextView>(R.id.getDataButton)
        val saveDataButton = findViewById<TextView>(R.id.saveDataButton)

        saveDataButton.setOnClickListener {
            val name = dataEditText.text.toString()
            val isSuccess = saveUserNameUseCase.execute(UserNameSaveDTO(name))
            dataTextView.text = "Is success save? - $isSuccess"
        }

        getDataButton.setOnClickListener {
            val userName = getUserNameUseCase.execute()

            dataTextView.text = "${userName.firstName} ${userName.lastName}"
        }

    }
}