package com.example.jetpackcomposemissionandroid.jetpackcompose.c10_navigation

import kotlinx.serialization.Serializable

// Sealed class creates a restricted hierarchy
// So its subclasses can only be defined in the same file

// Each subclass of sealed class can have its own data and behavior
@Serializable
sealed class MyNavRoutes {

    @Serializable
    object LoginScreen : MyNavRoutes()
    // "LoginScreen"

    @Serializable
    object HomeScreen : MyNavRoutes()

    @Serializable
    data class WelcomeScreen(val userName: String) : MyNavRoutes()

}