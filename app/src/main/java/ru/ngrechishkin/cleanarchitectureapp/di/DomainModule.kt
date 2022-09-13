package ru.ngrechishkin.cleanarchitectureapp.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun provideGetUserNameUseCase(userRepository: IUserRepository) =
        GetUserNameUseCase(userRepository = userRepository)

    @Provides
    fun provideSaveUserNameUseCase(userRepository: IUserRepository) =
        SaveUserNameUseCase(userRepository = userRepository)
}