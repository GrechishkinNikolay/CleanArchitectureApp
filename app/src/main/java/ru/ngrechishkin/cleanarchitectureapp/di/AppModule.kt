package ru.ngrechishkin.cleanarchitectureapp.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.ngrechishkin.cleanarchitectureapp.presentation.MainViewModel

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            saveUserNameUseCase = get(),
            getUserNameUseCase = get()
        )
    }
}