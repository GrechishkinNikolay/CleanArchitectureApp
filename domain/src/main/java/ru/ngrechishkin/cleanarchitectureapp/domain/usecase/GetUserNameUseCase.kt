package ru.ngrechishkin.cleanarchitectureapp.domain.usecase

import ru.ngrechishkin.cleanarchitectureapp.domain.models.UserNameGetDTO
import ru.ngrechishkin.cleanarchitectureapp.domain.repository.IUserRepository
import javax.inject.Inject

class GetUserNameUseCase @Inject constructor(private val userRepository: IUserRepository) {

    fun execute(): UserNameGetDTO {
        return userRepository.getUserName()
    }

}