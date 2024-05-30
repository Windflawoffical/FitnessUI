package com.example.fitnessui.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitnessui.ui.element.BottomNavBar
import com.example.fitnessui.ui.element.Calendar.Calendar
import com.example.fitnessui.ui.element.Calendar.CalendarUiModel
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScheduleScreen(
    navController: NavController,
    date: CalendarUiModel

) {
    Scaffold (bottomBar = { BottomNavBar(navController = navController) }, topBar = { CenterAlignedTopAppBar(
        title = { Text(text = "Расписание") })
    }) {
        Column (modifier = Modifier.padding(it)){
            Row  {
                ElevatedCard (modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(6.dp)){
                    Calendar(modifier = Modifier.padding(8.dp))
                }
            }
        }

    }
}