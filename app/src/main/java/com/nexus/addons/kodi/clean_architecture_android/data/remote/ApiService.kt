package com.nexus.addons.kodi.clean_architecture_android.data.remote

import com.nexus.addons.kodi.clean_architecture_android.data.model.UserDto
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<UserDto>
}