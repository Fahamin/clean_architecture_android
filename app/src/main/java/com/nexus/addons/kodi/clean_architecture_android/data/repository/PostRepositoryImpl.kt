package com.nexus.addons.kodi.clean_architecture_android.data.repository

import com.nexus.addons.kodi.clean_architecture_android.data.remote.ApiService
import com.nexus.addons.kodi.clean_architecture_android.domain.repository.UserRepository
import com.nexus.addons.kodi.clean_architecture_android.domain.model.User

class UserRepositoryImpl(private val apiService: ApiService) : UserRepository {
    override suspend fun getUsers(): List<User> {
        return apiService.getUsers().map { it.toUser() }
    }
}