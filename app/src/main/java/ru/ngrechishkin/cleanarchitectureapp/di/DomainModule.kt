package ru.ngrechishkin.cleanarchitectureapp.di

import org.koin.dsl.module
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase

val domainModule = module {
    factory<GetUserNameUseCase> { GetUserNameUseCase(userRepository = get()) }
    factory<SaveUserNameUseCase> { SaveUserNameUseCase(userRepository = get()) }
}