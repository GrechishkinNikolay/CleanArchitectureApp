package ru.ngrechishkin.cleanarchitectureapp.di

import android.content.Context
import dagger.Module
import org.koin.dsl.module
import ru.ngrechishkin.cleanarchitectureapp.data.repository.UserRepositoryImpl
import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorageDAO
import ru.ngrechishkin.cleanarchitectureapp.data.storage.sharedPrefs.SharedPrefUserDAO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

@Module
class DataModule {

    fun provideUserStorage(context: Context): IUserStorageDAO {
        return SharedPrefUserDAO(context = context)
    }

    fun provideIUserRepository(iUserStorageDAO: IUserStorageDAO): IUserRepository {
        return UserRepositoryImpl(userStorage = iUserStorageDAO)
    }
}

