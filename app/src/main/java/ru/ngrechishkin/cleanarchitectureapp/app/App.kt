package ru.ngrechishkin.cleanarchitectureapp.app

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import ru.ngrechishkin.cleanarchitectureapp.di.appModule
import ru.ngrechishkin.cleanarchitectureapp.di.dataModule
import ru.ngrechishkin.cleanarchitectureapp.di.domainModule

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@App)
            modules(
                listOf(
                    appModule,
                    domainModule,
                    dataModule
                )
            )
        }
    }
}