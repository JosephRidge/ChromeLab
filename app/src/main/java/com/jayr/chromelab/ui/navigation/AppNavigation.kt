package com.jayr.chromelab.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.jayr.chromelab.ui.screens.authentication.login.LoginScreen
import com.jayr.chromelab.ui.screens.onboarding.OnboardingScreen

@Composable
fun AppNavigation(navController: NavHostController, modifier: Modifier){
    NavHost(
        navController = navController,
        startDestination = ROUTES.Onboarding.name
    ) {
        composable (ROUTES.Onboarding.name){ OnboardingScreen(navController) }
        composable (ROUTES.Login.name){ LoginScreen(navController, modifier) }
    }
}