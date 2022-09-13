package ru.ngrechishkin.cleanarchitectureapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import ru.ngrechishkin.cleanarchitectureapp.data.repository.UserRepositoryImpl
import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorageDAO
import ru.ngrechishkin.cleanarchitectureapp.data.storage.sharedPrefs.SharedPrefUserDAO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideUserStorage(@ApplicationContext context: Context): IUserStorageDAO {
        return SharedPrefUserDAO(context = context)
    }

    @Provides
    @Singleton
    fun provideUserRepository(userStorage: IUserStorageDAO): IUserRepository {
        return UserRepositoryImpl(userStorage = userStorage)
    }
}