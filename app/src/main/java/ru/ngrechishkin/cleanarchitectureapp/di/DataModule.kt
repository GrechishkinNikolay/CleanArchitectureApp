package ru.ngrechishkin.cleanarchitectureapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import ru.ngrechishkin.cleanarchitectureapp.data.repository.UserRepositoryImpl
import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorageDAO
import ru.ngrechishkin.cleanarchitectureapp.data.storage.sharedPrefs.SharedPrefUserDAO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

@Module
class DataModule {

    @Provides
    fun provideUserStorage(@ApplicationContext context: Context): IUserStorageDAO {
        return SharedPrefUserDAO(context = context)
    }

    @Provides
    fun provideUserRepository(userStorage: IUserStorageDAO): IUserRepository {
        return UserRepositoryImpl(userStorage = userStorage)
    }
}