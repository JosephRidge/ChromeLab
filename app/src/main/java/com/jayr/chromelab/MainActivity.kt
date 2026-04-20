package com.jayr.chromelab

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import com.jayr.chromelab.ui.navigation.AppNavigation
import com.jayr.chromelab.ui.screens.authentication.forgotpassword.ForgotPasswordScreen
import com.jayr.chromelab.ui.screens.authentication.login.LoginScreen
import com.jayr.chromelab.ui.theme.ChromeLabTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val splashScreen = installSplashScreen()
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ChromeLabTheme {
                val navController = rememberNavController()
                Scaffold (modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AppNavigation(navController, modifier= Modifier.padding(innerPadding))
                 }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ChromeLabTheme {

    }
}