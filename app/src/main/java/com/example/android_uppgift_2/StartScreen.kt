package com.example.android_uppgift_2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.font.FontWeight.Companion.W300
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun StartScreen() {

    Column(
        modifier = Modifier.fillMaxSize().background(Color.Cyan),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {

        Text("1", fontSize = 100.sp)

        Button(onClick = {

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp)
                .padding(vertical = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Gray),
            shape = RectangleShape
        ) {
            Text("PLUS",
                fontSize = 42.sp,
                fontWeight = W300,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 30.dp)
                    .padding(horizontal = 10.dp)
            )
        }

        Button(onClick = {

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp)
                .padding(vertical = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Red.copy(alpha = 0.8f)),
            shape = RectangleShape
        ) {
            Text("RÖD",
                fontSize = 42.sp,
                fontWeight = W300,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 30.dp)
                    .padding(horizontal = 10.dp)
            )
        }

        Button(onClick = {

        },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 80.dp)
                .padding(vertical = 20.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Color.Green),
            shape = RectangleShape
        ) {
            Text("GRÖN",
                fontSize = 42.sp,
                fontWeight = W300,
                color = Color.Black,
                modifier = Modifier
                    .padding(vertical = 30.dp)
                    .padding(horizontal = 10.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun StartScreenPreview() {
    StartScreen()
}