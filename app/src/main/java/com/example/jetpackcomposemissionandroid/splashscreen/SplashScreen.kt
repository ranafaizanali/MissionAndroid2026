package com.example.jetpackcomposemissionandroid.splashscreen

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.lifecycleScope
import com.example.jetpackcomposemissionandroid.MainActivity
import com.example.jetpackcomposemissionandroid.R
import com.example.jetpackcomposemissionandroid.splashscreen.ui.theme.JetpackComposeMissionAndroidTheme
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashScreen : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        Handler(Looper.getMainLooper()).postDelayed(
//            {
//                startActivity(Intent(this, MainActivity::class.java))
//                finish()
//            }, 3000
//        )

        lifecycleScope.launch {
            delay(3000)
            startActivity(Intent(this@SplashScreen, MainActivity::class.java))
            finish()
        }

        enableEdgeToEdge()
        setContent {
            JetpackComposeMissionAndroidTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Column(
                        modifier = Modifier.fillMaxSize()
                            .padding(innerPadding)
                            .padding(bottom = 16.dp, top = 120.dp),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceBetween
                    ) {

                        Image(
                            painter = painterResource(R.drawable.logo),
                            contentDescription = "Logo",
                            modifier = Modifier.size(330.dp)
                        )

                        Text(
                            text = "Designed by Faizan Ali"
                        )

                    }

                }
            }
        }
    }
}