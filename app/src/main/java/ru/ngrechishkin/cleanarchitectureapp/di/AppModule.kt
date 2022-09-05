package ru.ngrechishkin.cleanarchitectureapp.di

import android.content.Context
import dagger.Module
import dagger.Provides
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.GetUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.domain.usecase.SaveUserNameUseCase
import ru.ngrechishkin.cleanarchitectureapp.presentation.MainViewModelFactory

@Module
class AppModule(val context: Context) {

    @Provides
    fun provideContext(): Context {
        return context
    }

//    @Provides
//    fun provideMainViewModelFactory(
//        getUserNameUseCase: GetUserNameUseCase,
//        saveUserNameUseCase: SaveUserNameUseCase
//    ): MainViewModelFactory {
//        return MainViewModelFactory(
//            getUserNameUseCase = getUserNameUseCase,
//            saveUserNameUseCase = saveUserNameUseCase
//        )
//    }

}