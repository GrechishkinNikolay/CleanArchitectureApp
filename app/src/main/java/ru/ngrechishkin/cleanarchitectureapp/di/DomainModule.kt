package ru.ngrechishkin.cleanarchitectureapp.di

import dagger.Module
import dagger.Provides
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase

@Module
class DomainModule {

    @Provides
    fun provideGetUserNameUseCase(userRepository: IUserRepository) =
        GetUserNameUseCase(userRepository = userRepository)

    @Provides
    fun provideSaveUserNameUseCase(userRepository: IUserRepository) =
        SaveUserNameUseCase(userRepository = userRepository)
}