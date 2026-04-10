package com.jayr.chromelab.ui.screens.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.jayr.chromelab.R

@Composable
fun LoginScreen(modifier: Modifier){
    //     text input
    var textInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= modifier
        ){
            //        lottie animation
            LottieAnimationWidget()
            //        email input
            UserInputWidget()
            //        password input
            //        button
        }
}


@Composable
fun LottieAnimationWidget() {
    val composition by
    rememberLottieComposition(LottieCompositionSpec.RawRes(R.raw.auth_login))
    val progress by animateLottieCompositionAsState(composition)
    LottieAnimation(
        composition = composition,
        progress = { progress },
        modifier = Modifier.size(350.dp)
    )
}

@Composable
fun UserInputWidget(){
//     text input
    var textInput by remember { mutableStateOf(TextFieldValue("")) }
//    input composable
    OutlinedTextField(
        value = textInput,
        onValueChange = { textInput = it },
        leadingIcon = {
            Icon(
               imageVector = Icons.Outlined.Email,
               contentDescription = "Email"
            )
        },
        maxLines = 1,
        modifier = Modifier.fillMaxWidth()
    )
}