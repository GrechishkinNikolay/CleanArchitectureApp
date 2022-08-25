package ru.ngrechishkin.cleanarchitectureapp.data.repository

import ru.ngrechishkin.cleanarchitectureapp.data.storage.IUserStorageDAO
import ru.ngrechishkin.cleanarchitectureapp.data.storage.models.UserEntity
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGetDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSaveDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository



class UserRepositoryImpl(private val userStorage: IUserStorageDAO): IUserRepository {

    override fun saveUserName(user: UserNameSaveDTO): Boolean {
        return userStorage.save(userToEntity(user))
    }

    override fun getUserName(): UserNameGetDTO {
        val user = userStorage.get()
        return userToDTO(user)
    }

    private fun userToDTO(user: UserEntity): UserNameGetDTO {
        return UserNameGetDTO(user.firstName, user.lastName)
    }

    private fun userToEntity(user: UserNameSaveDTO): UserEntity {
        return UserEntity(user.name, "Default last name in userToEntity method")
    }

}