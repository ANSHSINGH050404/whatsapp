package com.example.xwhatsapp.presentation.splash_screen.welcomescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.xwhatsapp.R


@Preview(showSystemUi = true)
@Composable

fun WelcomeScreen() {


    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    )
    {
        Image(
            painter = painterResource(R.drawable.whatsapp_sticker),
            contentDescription = null,
            modifier = Modifier.size(260.dp)
        )
        Text(text = "Welcome to Whatsapp ", fontSize = 24.sp, fontWeight = FontWeight.Bold)

        Row {
            Text(text = "Read Our", color = Color.Gray)
//            Text(text = "Policy", color = R.color.light_green)
        }


        Button(
            onClick = {},
            modifier = Modifier.size(280.dp, 43.dp),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = colorResource(R.color.dark_green)
            )
        ) { }
    }

}