package ru.ngrechishkin.cleanarchitectureapp.data.repository

import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorage
import ru.ngrechishkin.cleanarchitectureapp.data.storage.models.User
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGet
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSave
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository



class UserRepositoryImpl(private val userStorage: IUserStorage): IUserRepository {

    override fun saveUserName(username: UserNameSave): Boolean {
        val user = User(username.name, "")
        return userStorage.save(user)
    }

    override fun getUserName(): UserNameGet {
        val user = userStorage.get()
        return UserNameGet(user.firstName, user.lastName)
    }

}
// TODO: 32:10