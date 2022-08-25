package ru.ngrechishkin.cleanarchitectureapp.data.storage.sharedPrefs

import android.content.Context
import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorageDAO
import ru.ngrechishkin.cleanarchitectureapp.data.storage.models.UserEntity

private const val SHARED_PREFS_FILE_NAME = "sharedPrefFileName"
private const val KEY_FIRST_NAME = "firstName"
private const val KEY_LAST_NAME = "lastName"
private const val DEFAULT_FIRST_NAME = "Default first name"
private const val DEFAULT_LAST_NAME = "Default last name"

class SharedPrefUserDAO(context: Context): IUserStorageDAO {


    private val sharedPreferences = context.getSharedPreferences(SHARED_PREFS_FILE_NAME, Context.MODE_PRIVATE)

    override fun save(user: UserEntity): Boolean {
        sharedPreferences.edit().putString(KEY_FIRST_NAME, user.firstName).apply()
        sharedPreferences.edit().putString(KEY_LAST_NAME, user.lastName).apply()
        return true
    }

    override fun get(): UserEntity {
        val firstName = sharedPreferences.getString(KEY_FIRST_NAME, DEFAULT_FIRST_NAME)
        val lastName = sharedPreferences.getString(KEY_LAST_NAME, DEFAULT_LAST_NAME)

        return UserEntity(firstName!!, lastName!!)
    }
}