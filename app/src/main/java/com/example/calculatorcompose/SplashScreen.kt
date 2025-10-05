package com.example.calculatorcompose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.calculatorcompose.ui.theme.inter
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {
    Scaffold {
        paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Text(text = "Eray Calculator",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                fontStyle = FontStyle.Italic,
                fontFamily = inter
                )
        }
    }


    LaunchedEffect(key1 = true) {
        delay(1000)
        navController.navigate("calculatorscreen") {
            popUpTo("splashscreen") {inclusive = true}
        }
    }

}