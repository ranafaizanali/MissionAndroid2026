package com.example.jetpackcomposemissionandroid.sharedpref

import android.content.Context
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.core.content.edit
import com.example.jetpackcomposemissionandroid.R

@Composable
fun SharedPreferences(context: Context) {

    var username by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    var savedData by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(250.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        TextField(
            value = username,
            onValueChange = { username = it },
            label = { Text(text = "Username") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        TextField(
            value = password,
            onValueChange = { password = it },
            label = { Text(text = "Password") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(24.dp))

        // To save data
        Button(
            onClick = {
                val sharedPref = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)
                sharedPref.edit {
                    putString("username", username)
                    putString("password", password)
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Save Data")
        }

        // To remove data
        Button(
            onClick = {
                val sharedPref = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

                sharedPref.edit {
                    clear()
                }
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Remove Data")
        }

        // To hide data
        Button(
            onClick = { savedData = "" },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Hide Data")
        }

        // To show data
        Button(
            onClick = {
                val sharedPref = context.getSharedPreferences("MyPref", Context.MODE_PRIVATE)

                val savedUsername = sharedPref.getString("username", "No username!")
                val savedPassword = sharedPref.getString("password", "No password!")

                savedData = "Username: $savedUsername\nPassword: $savedPassword"
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text = "Show Data")
        }

        if (savedData.isNotEmpty()) {
            Text(text = savedData)
        }

    }

}