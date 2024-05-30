package com.example.fitnessui.ui.element

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.solver.state.Dimension.Wrap
import androidx.navigation.NavController
import com.example.fitnessui.R
import com.example.fitnessui.Screen

@Composable
fun BottomNavBar(navController: NavController) {
    BottomAppBar (containerColor = Color.White, contentColor = Color.Black) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            IconButton(onClick = { navController.navigate(Screen.NewsScreen.route) }) {
                Icon(imageVector = ImageVector.vectorResource(id = R.drawable.icon_news), contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = if (navController.currentBackStackEntry?.destination?.route == Screen.NewsScreen.route) Color.Red else Color.Black)
            }
            IconButton(onClick = { navController.navigate(Screen.ScheduleScreen.route) }) {
                Icon(imageVector = Icons.Default.DateRange, contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = if (navController.currentBackStackEntry?.destination?.route == Screen.ScheduleScreen.route) Color.Red else Color.Black)
            }
            IconButton(onClick = { navController.navigate(Screen.HomeScreen.route) }) {
                Icon(imageVector = Icons.Default.Home, contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = if (navController.currentBackStackEntry?.destination?.route == Screen.HomeScreen.route) Color.Red else Color.Black)
            }
            IconButton(onClick = { navController.navigate(Screen.ProfileScreen.route) }) {
                Icon(imageVector = Icons.Default.Person, contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = if (navController.currentBackStackEntry?.destination?.route == Screen.ProfileScreen.route) Color.Red else Color.Black)
            }
            IconButton(onClick = { navController.navigate(Screen.MenuScreen.route) }) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = if (navController.currentBackStackEntry?.destination?.route == Screen.MenuScreen.route) Color.Red else Color.Black)
            }
        }
    }
}