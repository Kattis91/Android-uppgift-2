package com.example.android_uppgift_2

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNav(viewModel: ViewModel = viewModel()) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "startScreen") {
        composable("startScreen") {
            StartScreen(navController, viewModel)
        }
        composable("redScreen") {
            RedScreen(viewModel)
        }
        composable("greenScreen") {
            GreenScreen(viewModel)
        }
    }
}