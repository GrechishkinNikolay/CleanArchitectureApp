package ru.ngrechishkin.cleanarchitectureapp.data.repository

import android.content.Context
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGet
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSave
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

private const val SHARED_PREFS_FILE_NAME = "sharedPrefFileName"
private const val KEY_FIRST_NAME = "firstName"
private const val KEY_LAST_NAME = "lastName"

class UserRepositoryImpl(context: Context): IUserRepository {

    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_FILE_NAME, Context.MODE_PRIVATE)

    override fun saveUserName(username: UserNameSave): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, username.name).apply()
        return true
    }

    override fun getUserName(): UserNameGet {
        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, "")
        val lastName = sharedPreferences.getString(KEY_LAST_NAME, "")

        return UserNameGet(firstName!!, lastName!!)
    }

}