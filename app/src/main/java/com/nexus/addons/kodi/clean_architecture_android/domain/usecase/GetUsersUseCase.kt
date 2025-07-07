package com.nexus.addons.kodi.clean_architecture_android.domain.usecase

import com.nexus.addons.kodi.clean_architecture_android.domain.repository.UserRepository
import com.nexus.addons.kodi.clean_architecture_android.domain.model.User

class GetUsersUseCase(private val repository: UserRepository) {
    suspend operator fun invoke(): List<User> {
        return repository.getUsers()
    }
}