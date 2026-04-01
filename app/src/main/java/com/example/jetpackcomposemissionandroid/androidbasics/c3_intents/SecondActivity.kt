package com.example.jetpackcomposemissionandroid.androidbasics.c3_intents

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.jetpackcomposemissionandroid.MainActivity
import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme


class SecondActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            JetpackComposeMissionAndroidTheme {

                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ) {

                    Text("Second Activity")

                    Button(
                        onClick = {
                            val intent = Intent(
                                this@SecondActivity,
                                MainActivity::class.java
                            )
                            startActivity(intent)
                        }
                    ) {
                        Text("Go to Main Activity")
                    }
                }
            }
        }
    }
}