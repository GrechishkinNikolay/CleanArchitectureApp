package ru.ngrechishkin.cleanarchitectureapp.domain.repository

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGet
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSave

interface IUserRepository {

    fun saveUserName(username: UserNameSave): Boolean

    fun getUserName(): UserNameGet

}