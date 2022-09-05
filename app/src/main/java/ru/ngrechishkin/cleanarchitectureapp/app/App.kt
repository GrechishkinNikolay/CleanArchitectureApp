package ru.ngrechishkin.cleanarchitectureapp.app

import android.app.Application
import ru.ngrechishkin.cleanarchitectureapp.di.AppComponent
import ru.ngrechishkin.cleanarchitectureapp.di.AppModule
import ru.ngrechishkin.cleanarchitectureapp.di.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(context = this))
            .build()
    }
}