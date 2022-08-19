package ru.ngrechishkin.cleanarchitectureapp.domain.repository

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserName
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSave

interface IUserRepository {

    fun saveUserName(username: UserNameSave): Boolean

    fun getUserName(): UserName

}