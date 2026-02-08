package com.example.jetpackcomposemissionandroid.jetpackcompose

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.layoutBounds
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TextExample() {

    Text(
        text = "Mission Android 2026",
        color = Color.Blue,
        fontSize = 30.sp,
        fontWeight = FontWeight.Bold,
        fontFamily = FontFamily.Monospace,
        letterSpacing = 2.sp,
        textAlign = TextAlign.Center
    )
}

@Composable
fun TextFieldExample() {

    var name by remember { mutableStateOf("") }

    TextField(
        value = name,
        onValueChange = { name = it },
        // label = { Text(text = "Enter Your Name") },
        placeholder = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = true,
        shape = CircleShape,
        colors = TextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            unfocusedIndicatorColor = Color.Black,
            focusedIndicatorColor = Color.Blue,
            cursorColor = Color.Magenta,
            unfocusedPlaceholderColor = Color.Gray,
            focusedPlaceholderColor = Color.Cyan,
            unfocusedLeadingIconColor = Color.Red,
            focusedLeadingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedLabelColor = Color.Red,
            focusedLabelColor = Color.Green
        )
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OutlinedTextFieldExample() {

    var name by remember { mutableStateOf("") }

    OutlinedTextField(
        value = name,
        onValueChange = { name = it },
        label = { Text(text = "Enter Your Name") },
        leadingIcon = {
            Text(
                text = "*",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        trailingIcon = {
            Text(
                text = "#",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
        },
        singleLine = true,
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults.colors(
            unfocusedTextColor = Color.Red,
            focusedTextColor = Color.Green,
            unfocusedContainerColor = Color.White,
            focusedContainerColor = Color.Yellow,
            focusedBorderColor = Color.Blue,
            unfocusedBorderColor = Color.Red,
            cursorColor = Color.Magenta,
            unfocusedPlaceholderColor = Color.Gray,
            focusedPlaceholderColor = Color.Cyan,
            unfocusedLeadingIconColor = Color.Red,
            focusedLeadingIconColor = Color.Green,
            unfocusedTrailingIconColor = Color.Red,
            focusedTrailingIconColor = Color.Green,
            unfocusedLabelColor = Color.Red,
            focusedLabelColor = Color.Green
        )
    )

}