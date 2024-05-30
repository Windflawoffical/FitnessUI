package com.example.fitnessui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitnessui.ui.element.Calendar.CalendarUiModel
import com.example.fitnessui.ui.screen.HomeScreen
import com.example.fitnessui.ui.screen.MenuScreen
import com.example.fitnessui.ui.screen.NewsScreen
import com.example.fitnessui.ui.screen.NotificationScreen
import com.example.fitnessui.ui.screen.ProfileScreen
import com.example.fitnessui.ui.screen.ScheduleScreen
import com.example.fitnessui.ui.screen.SplashScreen
import com.example.fitnessui.ui.theme.FitnessUITheme
import java.time.LocalDate

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FitnessUITheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colorScheme.background)
                {
                    val data: CalendarUiModel.Date = CalendarUiModel.Date(LocalDate.now(), true, true)
                    val mydata: CalendarUiModel = CalendarUiModel(data, listOf(data))
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.SplashScreen.route )
                    {
                        composable(route = Screen.SplashScreen.route) {
                            SplashScreen(navController = navController)
                        }
                        composable(route = Screen.HomeScreen.route) {
                            HomeScreen(navController = navController)
                        }
                        composable(route = Screen.MenuScreen.route) {
                            MenuScreen(navController = navController)
                        }
                        composable(route = Screen.NewsScreen.route) {
                            NewsScreen(navController = navController)
                        }
                        composable(route = Screen.ProfileScreen.route) {
                            ProfileScreen(navController = navController)
                        }
                        composable(route = Screen.ScheduleScreen.route) {
                            ScheduleScreen(navController = navController, mydata)
                        }
                        composable(route = Screen.NotificationScreen.route) {
                            NotificationScreen(navController = navController)
                        }
                    }
                }
            }
        }
    }
}