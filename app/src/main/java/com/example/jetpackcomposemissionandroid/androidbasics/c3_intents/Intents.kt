package com.example.jetpackcomposemissionandroid.androidbasics.c3_intents

/******************** Main Activity ********************/

//import android.content.Intent
//import android.net.Uri
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.activity.viewModels
//import androidx.compose.foundation.layout.Arrangement
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.material3.Button
//import androidx.compose.material3.Text
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import coil3.compose.AsyncImage
//import com.example.jetpackcomposemissionandroid.androidbasics.c2_viewmodel.CounterApp
//import com.example.jetpackcomposemissionandroid.androidbasics.c2_viewmodel.ScoreViewModel
//import com.example.jetpackcomposemissionandroid.androidbasics.c3_intents.ImageViewModel
//import com.example.jetpackcomposemissionandroid.androidbasics.c3_intents.SecondActivity
//import com.example.jetpackcomposemissionandroid.jetpackcompose.SnackBarExample
//import com.example.jetpackcomposemissionandroid.ui.theme.JetpackComposeMissionAndroidTheme
//import java.lang.Exception
//
//class MainActivity : ComponentActivity() {
//
//
//    // ViewModel Instance(C03)
//    private val viewModel: ImageViewModel by viewModels()
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        println("onCreate() called!")
//        enableEdgeToEdge()
//        setContent {
//            JetpackComposeMissionAndroidTheme {
//
//                Column(
//                    modifier = Modifier.fillMaxSize(),
//                    horizontalAlignment = Alignment.CenterHorizontally,
//                    verticalArrangement = Arrangement.Center
//                ) {
//
//                    AsyncImage(
//                        model = viewModel.uri,
//                        contentDescription = null
//                    )
//
//                    Text("Main Activity")
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(
//                                this@MainActivity,
//                                SecondActivity::class.java
//                            )
//                            startActivity(intent)
//                        }
//                    ) {
//                        Text("Go to Second Activity")
//                    }
//
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_VIEW)
//                            intent.data = Uri.parse("https://neatroots.com/mentorship-program/")
//                            startActivity(intent)
//                        }
//                    ) {
//                        Text("AnDev Formula Link")
//                    }
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_MAIN)
//                            intent.setPackage("com.google.android.apps.maps")
//                            try {
//                                startActivity(intent)
//                            } catch (e: Exception) {
//                                e.printStackTrace()
//                            }
//
//                        }
//                    ) {
//                        Text("Open Maps App")
//                    }
//
//                    Button(
//                        onClick = {
//                            val intent = Intent(Intent.ACTION_SEND)
//                            intent.type = "text/plain"
//                            intent.putExtra(
//                                Intent.EXTRA_TEXT,
//                                "Hi! I am from Mission Android 2026!"
//                            )
//                            startActivity(Intent.createChooser(intent, "Share Via"))
//                        }
//                    ) {
//
//                        Text("Send Text Message")
//                    }
//                }
//
//            }
//        }
//
//        val uri = intent.getParcelableExtra(
//            Intent.EXTRA_STREAM, Uri::class.java
//        )
//
//        viewModel.updateUri(uri)
//
//    }
//}

/******************** Android Manifests ********************/

//<?xml version="1.0" encoding="utf-8"?>
//<manifest xmlns:android="http://schemas.android.com/apk/res/android"
//xmlns:tools="http://schemas.android.com/tools">
//
//<application
//android:allowBackup="true"
//android:dataExtractionRules="@xml/data_extraction_rules"
//android:fullBackupContent="@xml/backup_rules"
//android:icon="@mipmap/ic_launcher"
//android:label="@string/app_name"
//android:launchMode = "singleTop"
//android:roundIcon="@mipmap/ic_launcher_round"
//android:supportsRtl="true"
//android:theme="@style/Theme.JetpackComposeMissionAndroid">
//<activity
//android:name=".MainActivity"
//android:exported="true"
//android:label="@string/app_name"
//android:theme="@style/Theme.JetpackComposeMissionAndroid">
//<intent-filter>
//<action android:name="android.intent.action.MAIN" />
//
//<category android:name="android.intent.category.LAUNCHER" />
//</intent-filter>
//
//// To share Images with App
//<intent-filter>
//<action android:name="android.intent.action.SEND" />
//<category android:name="android.intent.category.DEFAULT" />
//<data android:mimeType="image/*" />
//</intent-filter>
//
//</activity>
//
//// Specify Second Activity
//<activity android:name=".androidbasics.c3_intents.SecondActivity" />
//</application>
//
//</manifest>