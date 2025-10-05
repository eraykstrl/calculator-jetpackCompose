package com.example.calculatorcompose

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun ScreenTransitions() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "splashscreen") {

        composable("splashscreen") {
            SplashScreen(navController)
        }

        composable("calculatorscreen") {
            CalculatorScreen()
        }
    }
}