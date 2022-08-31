package ru.ngrechishkin.cleanarchitectureapp.di

import org.koin.dsl.module
import ru.ngrechishkin.cleanarchitectureapp.data.repository.UserRepositoryImpl
import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorageDAO
import ru.ngrechishkin.cleanarchitectureapp.data.storage.sharedPrefs.SharedPrefUserDAO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

val dataModule = module {

    single<IUserStorageDAO> {
        SharedPrefUserDAO(context = get())
    }

    single<IUserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}

