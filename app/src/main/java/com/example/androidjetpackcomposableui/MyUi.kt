package com.example.androidjetpackcomposableui

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp

@Composable
fun MyUi() {
    Column(
        modifier = Modifier
            .fillMaxSize() // Makes the Column take up the full size of the screen
            .padding(16.dp), // Adds padding around the content
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(36.dp), // Space between the TextFields
    ) {
        TextField(
            value = "",
            onValueChange = { /* handle text change */ },
            label = { Text("Email") },
            modifier = Modifier.width(290.dp)// This will make each TextField take equal width
        )
        TextField(
            value = "",
            onValueChange = { /* handle text change */ },
            label = { Text("Password") },
            modifier = Modifier.width(290.dp) // This will make each TextField take equal width
        )


        val context = LocalContext.current
        Button(
            onClick = {
                handleButtonClick(context)
            },
            modifier = Modifier
                .align(Alignment.CenterHorizontally) // Aligns the Button at the bottom center
                .width(150.dp)
            // Adds some padding to the bottom to avoid touching the edge
        ) {
            Text("login")
        }
    }
}

fun handleButtonClick(context: android.content.Context) {
    // Show the Toast inside a separate function
    Toast.makeText(context, "Successful", Toast.LENGTH_SHORT).show()
}

