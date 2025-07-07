package com.nexus.addons.kodi.clean_architecture_android

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.nexus.addons.kodi.clean_architecture_android.di.AppModule
import com.nexus.addons.kodi.clean_architecture_android.presentation.screen.UserScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val userViewModel = AppModule.provideUserViewModel()

        setContent {
            UserScreen(viewModel = userViewModel)
        }

    }
}
