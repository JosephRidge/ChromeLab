package com.jayr.chromelab.ui.screens.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.LottieConstants
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.jayr.chromelab.R


@Composable
fun LoginScreen(){
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.padding(16.dp)
    ) {
    //        lottie animation
        LottieAnimationWidget()
    //        email input
        UserInputWidget()
    //        password input
        UserInputWidget()
    //        button
        ButtonWidget()
    }
    }
}

@Composable
fun LottieAnimationWidget(){
        val composition by rememberLottieComposition(
            LottieCompositionSpec.RawRes(R.raw.auth_login))
        val progress by animateLottieCompositionAsState(
            composition,
            iterations = LottieConstants.IterateForever
            )
        LottieAnimation(
            composition = composition,
            progress = { progress },
            modifier = Modifier.size(350.dp)
        )
}

@Composable
fun UserInputWidget(){
    // mutable variable - when changes recomposition happens
   var text by remember { mutableStateOf(TextFieldValue("")) }
//    composable for inpts
   OutlinedTextField(
       value = text,
       onValueChange = {
           text = it
       },
       placeholder = { Text(text = "eg. user@example.com") },
       leadingIcon = {
           Icon(
               imageVector = Icons.Outlined.Email,
             "Email Section"
           ) },
       modifier = Modifier.fillMaxWidth(),

   )
}

@Composable
fun ButtonWidget(){
    OutlinedButton(
        onClick = {}
    ) {
        Text(text="Login")
    }
}