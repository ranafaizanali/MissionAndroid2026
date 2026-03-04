package com.example.jetpackcomposemissionandroid.jetpackcompose.c13_navigation_bar

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun NavBarNavigation() {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavBarRoutes.Home
    ){

        composable<NavBarRoutes.Home> {
            NavBarHomeScreen(navController)
        }

        composable<NavBarRoutes.Search> {
            NavBarSearchScreen(navController)
        }

        composable<NavBarRoutes.Notifications> {
            NavBarNotificationScreen(navController)
        }

        composable<NavBarRoutes.Profile> {
            NavBarProfileScreen(navController)
        }

    }

}