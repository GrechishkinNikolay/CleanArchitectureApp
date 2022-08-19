package ru.ngrechishkin.cleanarchitectureapp.domain.usecase

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSave
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

class SaveUserNameUseCase(private val userRepository: IUserRepository) {

    fun execute(name: UserNameSave): Boolean {
        return userRepository.saveUserName(name)
    }
}