package ru.ngrechishkin.cleanarchitectureapp.data.storage

import ru.ngrechishkin.cleanarchitectureapp.data.storage.models.User

interface IUserStorage {

    fun save(user: User): Boolean

    fun get(): User

}