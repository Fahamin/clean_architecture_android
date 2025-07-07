package com.nexus.addons.kodi.clean_architecture_android.domain.repository

import com.nexus.addons.kodi.clean_architecture_android.domain.model.User



interface UserRepository {
    suspend fun getUsers(): List<User>
}
