package com.nexus.addons.kodi.clean_architecture_android.di

import com.nexus.addons.kodi.clean_architecture_android.data.remote.ApiService
import com.nexus.addons.kodi.clean_architecture_android.data.repository.UserRepositoryImpl
import com.nexus.addons.kodi.clean_architecture_android.domain.usecase.GetUsersUseCase
import com.nexus.addons.kodi.clean_architecture_android.presentation.viewmodel.UserViewModel
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object AppModule {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val apiService = retrofit.create(ApiService::class.java)

    private val repository = UserRepositoryImpl(apiService)
    private val getUsersUseCase = GetUsersUseCase(repository)

    fun provideUserViewModel(): UserViewModel {
        return UserViewModel(getUsersUseCase)
    }
}