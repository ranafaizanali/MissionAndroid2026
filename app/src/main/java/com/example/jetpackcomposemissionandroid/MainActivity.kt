package com.example.jetpackcomposemissionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposemissionandroid.jetpackcompose.SnackBarExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.ToastExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.c13_navigation_bar.NavBarHomeScreen
import com.example.jetpackcomposemissionandroid.jetpackcompose.c13_navigation_bar.NavBarNavigation
import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndroidTheme {

                SnackBarExample()

            }
        }
    }
}