package com.jayr.chromelab.ui.screens.authentication.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Email
import androidx.compose.material.icons.outlined.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.airbnb.lottie.compose.LottieAnimation
import com.airbnb.lottie.compose.LottieCompositionSpec
import com.airbnb.lottie.compose.animateLottieCompositionAsState
import com.airbnb.lottie.compose.rememberLottieComposition
import com.jayr.chromelab.R
import com.jayr.chromelab.ui.components.LottieAnimationWidget
import com.jayr.chromelab.ui.components.pagePadding

@Composable
fun LoginScreen(modifier: Modifier){
//     inputs
    var emailInput by remember { mutableStateOf(TextFieldValue("")) }
    var passwordInput by remember { mutableStateOf(TextFieldValue("")) }

        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier= modifier.padding(pagePadding)
        ){
            //        lottie animation
            LottieAnimationWidget(R.raw.auth_login,300.dp)

            //        email input
            OutlinedTextField(
                value = emailInput,
                onValueChange = { emailInput = it },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Outlined.Email,
                        contentDescription = "Email"
                    )
                },
                placeholder = {
                    Text(text="eg. jd@example.com")
                },
                maxLines = 1,
                modifier = Modifier.fillMaxWidth()
            )
            //        password input
            OutlinedTextField(
                value = passwordInput,
                onValueChange = { passwordInput = it },
                leadingIcon = {
                    Icon(
                        imageVector = ImageVector.vectorResource(R.drawable.password_icon),
                        contentDescription = "Email"
                    )
                },
                placeholder = {
                    Text(text="eg. jd@example.com")
                },
                maxLines = 1,
                modifier = Modifier.fillMaxWidth()
            )
            //        button
            OutlinedButton(
                onClick = {}
            ) {
                Text(text = "login",
                    modifier = Modifier.padding(horizontal = 24.dp))
            }

//             row
            Row(){
                Text(text = "Forgot Password")
                Text(text = "No account?")
            }
        }
}


