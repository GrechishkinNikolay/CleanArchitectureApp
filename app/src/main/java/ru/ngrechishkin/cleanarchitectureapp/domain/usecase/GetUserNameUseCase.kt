package ru.ngrechishkin.cleanarchitectureapp.domain.usecase

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserName
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

class GetUserNameUseCase(private val userRepository: IUserRepository) {

    fun execute(): UserName {
        return userRepository.getUserName()
    }

}