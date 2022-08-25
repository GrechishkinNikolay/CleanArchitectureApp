package ru.ngrechishkin.cleanarchitectureapp.data.storage

import ru.ngrechishkin.cleanarchitectureapp.data.storage.models.UserEntity

interface IUserStorageDAO {

    fun save(user: UserEntity): Boolean

    fun get(): UserEntity

}