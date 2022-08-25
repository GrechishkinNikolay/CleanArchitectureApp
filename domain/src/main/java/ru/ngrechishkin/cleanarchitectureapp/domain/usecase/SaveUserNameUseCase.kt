package ru.ngrechishkin.cleanarchitectureapp.domain.usecase

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameSaveDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

class SaveUserNameUseCase(private val userRepository: IUserRepository) {

    fun execute(name: UserNameSaveDTO): Boolean {
        return userRepository.saveUserName(name)
    }
}