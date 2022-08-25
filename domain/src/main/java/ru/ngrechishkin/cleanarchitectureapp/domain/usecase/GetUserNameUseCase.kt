package ru.ngrechishkin.cleanarchitectureapp.domain.usecase

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGetDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository

class GetUserNameUseCase(private val userRepository: IUserRepository) {

    fun execute(): UserNameGetDTO {
        return userRepository.getUserName()
    }

}