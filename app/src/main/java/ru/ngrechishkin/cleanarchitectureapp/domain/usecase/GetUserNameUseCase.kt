package ru.ngrechishkin.cleanarchitectureapp.domain.usecase

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGet
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

class GetUserNameUseCase(private val userRepository: IUserRepository) {

    fun execute(): UserNameGet {
        return userRepository.getUserName()
    }

}