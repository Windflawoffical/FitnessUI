package com.example.fitnessui

sealed class Screen(val route: String) {
    object HomeScreen: Screen("HomeScreen")
    object MenuScreen: Screen("MenuScreen")
    object NewsScreen: Screen("NewsScreen")
    object ProfileScreen: Screen("ProfileScreen")
    object ScheduleScreen: Screen("ScheduleScreen")
    object NotificationScreen: Screen("NotificationScreen")
    object SplashScreen: Screen("SplashScreen")
}