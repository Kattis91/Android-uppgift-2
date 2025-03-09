package com.example.android_uppgift_2

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun AppNav() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "startScreen") {
        composable("startScreen") {
            StartScreen(navController)
        }
        composable("redScreen") {
            RedScreen()
        }
        composable("greenScreen") {
            GreenScreen()
        }
    }
}