package ru.ngrechishkin.cleanarchitectureapp.di

import dagger.Component
import ru.ngrechishkin.cleanarchitectureapp.presentation.MainActivity

@Component(modules = [AppModule::class, DomainModule::class, DataModule::class])
interface AppComponent {
    fun inject(mainActivity: MainActivity)
}