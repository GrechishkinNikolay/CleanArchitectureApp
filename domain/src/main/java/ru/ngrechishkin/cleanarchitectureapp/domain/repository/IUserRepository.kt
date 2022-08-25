package ru.ngrechishkin.cleanarchitectureapp.domain.repository

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGetDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSaveDTO

interface IUserRepository {

    fun saveUserName(username: UserNameSaveDTO): Boolean

    fun getUserName(): UserNameGetDTO

}