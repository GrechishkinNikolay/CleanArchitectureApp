package ru.ngrechishkin.cleanarchitectureapp.data.repository

import android.content.Context
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserName
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSave
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

private const val SHARED_PREFS_NAME = "sharedPrefName"

class UserRepositoryImpl(private val context: Context): IUserRepository {

    val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_NAME, Context.MODE_PRIVATE)

    override fun saveUserName(username: UserNameSave): Boolean {
        TODO("На чём закончил")
    }

    override fun getUserName(): UserName {
        return UserName("123", "345")
    }

}