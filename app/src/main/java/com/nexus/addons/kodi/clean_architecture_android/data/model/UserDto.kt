package com.nexus.addons.kodi.clean_architecture_android.data.model

import com.nexus.addons.kodi.clean_architecture_android.domain.model.User

data class UserDto(
    val id: Int,
    val name: String,
    val email: String
) {
    fun toUser(): User {
        return User(id = id, name = name, email = email)
    }
}