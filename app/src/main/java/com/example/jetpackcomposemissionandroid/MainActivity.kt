package com.example.jetpackcomposemissionandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.jetpackcomposemissionandroid.jetpackcompose.LazyColumnExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.LazyRowExample
import com.example.jetpackcomposemissionandroid.jetpackcompose.NestedLazyLists
import com.example.jetpackcomposemissionandroid.jetpackcompose.c10_navigation.NavGraph
import com.example.jetpackcomposemissionandroid.jetpackcompose.c12_scaffold.MyScreen
import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndroidTheme {

                MyScreen()

            }
        }
    }
}