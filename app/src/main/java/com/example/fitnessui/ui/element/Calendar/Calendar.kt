package com.example.fitnessui.ui.element.Calendar

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.fitnessui.Screen
import com.example.fitnessui.ui.screen.HomeScreen
import com.example.fitnessui.ui.screen.ScheduleScreen
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.format.FormatStyle
import java.util.Locale


@Composable
fun Calendar(
    modifier: Modifier = Modifier,
) {
    val dataSource = CalendarDataSource()
    var data by remember { mutableStateOf(dataSource.getData(lastSelectedDate = dataSource.today)) }
    Column(modifier = modifier.fillMaxSize()) {
        Header(
            data = data,
            onPrevClickListener = { startDate ->
                val finalStartDate = startDate.minusDays(1)
                data = dataSource.getData(startDate = finalStartDate, lastSelectedDate = data.selectedDate.date)
            },
            onNextClickListener = { endDate ->
                val finalStartDate = endDate.plusDays(2)
                data = dataSource.getData(startDate = finalStartDate, lastSelectedDate = data.selectedDate.date)
            }
        )
        Content(data = data) { date ->
            data = data.copy(
                selectedDate = date,
                visibleDates = data.visibleDates.map {
                    it.copy(
                        isSelected = it.date.isEqual(date.date)
                    )
                }
            )
        }
    }
}

@Composable
fun Header(
    data: CalendarUiModel,
    onPrevClickListener: (LocalDate) -> Unit,
    onNextClickListener: (LocalDate) -> Unit,
) {
    Row {
        Text(
            text = data.selectedDate.date.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale("ru"))),
            modifier = Modifier
                .weight(1f)
                .align(Alignment.CenterVertically)
        )
        IconButton(onClick = {
            onPrevClickListener(data.startDate.date)
        }) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowLeft,
                contentDescription = "Back"
            )
        }
        IconButton(onClick = {
            onNextClickListener(data.endDate.date)
        }) {
            Icon(
                imageVector = Icons.Filled.KeyboardArrowRight,
                contentDescription = "Next"
            )
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Content(
    data: CalendarUiModel,
    onDateClickListener: (CalendarUiModel.Date) -> Unit
) {
    LazyVerticalGrid(columns = GridCells.Adaptive(minSize = 48.dp),
        horizontalArrangement = Arrangement.Center) {
        items(data.visibleDates.size) { index ->
            ContentItem(
                date = data.visibleDates[index],
                onDateClickListener
            )
        }
    }
    if (data.selectedDate.date.format(
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(
                Locale("ru")
            )) == "пятница, 31 мая 2024 г.") {
        ElevatedCard(
            onClick = { /*TODO*/ }
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
                    .background(Color.White)
            ) {
                Text(
                    text = "20:00\n55 мин.",
                    fontSize = 14.sp,

                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Pump #48\nЗал групповых программ №1\nБолтенков Павел",
                    fontSize = 16.sp,

                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.weight(1.0f))
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
    if (data.selectedDate.date.format(
            DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(
                Locale("ru")
            )) == "вторник, 4 июня 2024 г.") {
        ElevatedCard(
            onClick = { /*TODO*/ }
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(6.dp)
                    .background(Color.White)
            ) {
                Text(
                    text = "14:00\n55 мин.",
                    fontSize = 14.sp,

                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.width(20.dp))
                Text(
                    text = "Combat\nЗал групповых программ №1\nПогудин Артем",
                    fontSize = 16.sp,

                    modifier = Modifier.align(Alignment.CenterVertically)
                )
                Spacer(modifier = Modifier.weight(1.0f))
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = null,
                    modifier = Modifier
                        .size(25.dp)
                        .align(Alignment.CenterVertically)
                )
            }
        }
    }
}

@Composable
fun ContentItem(
    date: CalendarUiModel.Date,
    onClickListener: (CalendarUiModel.Date) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(vertical = 8.dp, horizontal = 8.dp)
            .clickable {
                onClickListener(date)
                println(date)
            },
        colors = CardDefaults.cardColors(
            containerColor = if (date.isSelected) {
                Color.Red
            } else {
                Color.White
            }
        ),
    ) {
        Column(
            modifier = Modifier
                .width(40.dp)
                .height(48.dp)
                .padding(4.dp)
        ) {
            Text(
                text = if (date.day == "Mon") "ПН"
                else if (date.day == "Tue") "ВТ"
                else if (date.day == "Wed") "СР"
                else if (date.day == "Thu") "ЧТ"
                else if (date.day == "Fri") "ПТ"
                else if (date.day == "Sat") "CБ"
                else "ВС",
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = if (date.isSelected) Color.White else Color.Black,
                style = MaterialTheme.typography.bodySmall
            )
            Text(
                text = date.date.dayOfMonth.toString(),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = if (date.isSelected) Color.White else Color.Black,
                style = MaterialTheme.typography.bodyMedium,
            )
        }
    }
}