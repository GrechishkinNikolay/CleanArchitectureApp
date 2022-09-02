package ru.ngrechishkin.cleanarchitectureapp.di

import dagger.Module
import org.koin.dsl.module
import ru.ngrechishkin.cleanarchitectureapp.data.repository.UserRepositoryImpl
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase

@Module
class DomainModule {

    fun provideGetUserNameUseCase(userRepository: UserRepositoryImpl): GetUserNameUseCase {
        return GetUserNameUseCase(userRepository = userRepository)
    }

    fun provideSaveUserNameUseCase(userRepository: UserRepositoryImpl): SaveUserNameUseCase {
        return SaveUserNameUseCase(userRepository = userRepository)
    }

}