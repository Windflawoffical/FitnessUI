package com.example.fitnessui.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.outlined.CheckCircle
import androidx.compose.material.icons.outlined.Face
import androidx.compose.material.icons.outlined.Star
import androidx.compose.material.icons.twotone.Face
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(
    navController: NavController
) {
    Scaffold (bottomBar = { BottomNavBar(navController = navController) }, topBar = { CenterAlignedTopAppBar(
        title = { Text(text = "Личный кабинет")},
        actions = {
            IconButton(onClick = { }) {
            Icon(imageVector = Icons.Default.ExitToApp, contentDescription = null, modifier = Modifier.size(28.dp))
            }
        }
    )
    }) {
        LazyColumn (Modifier.padding(it), contentPadding = PaddingValues(5.dp)) {
            item {
                ElevatedCard(
                    onClick = { /*TODO*/ },
                    elevation = CardDefaults.cardElevation(0.dp),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Outlined.Face,
                            contentDescription = null,
                            modifier = Modifier
                                .size(32.dp)
                                .align(Alignment.CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Column {
                            Text(
                                text = "Валиков Кирилл Юрьевич",
                                fontSize = 16.sp,
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "I LOVE Б5",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                        }
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
                Box (modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(85.dp)){
                    ElevatedCard(
                        modifier = Modifier.align(Alignment.TopStart),
                        elevation = CardDefaults.cardElevation(0.dp),
                        shape = RoundedCornerShape(0.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                                .background(Color.White)
                        ) {
                            Text(
                                text = "РОДСТВЕННИКИ",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                        }
                    }
                    ElevatedCard(
                        onClick = { /*TODO*/ },
                        elevation = CardDefaults.cardElevation(0.dp),
                        shape = RoundedCornerShape(0.dp),
                        modifier = Modifier.align(Alignment.BottomStart)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                                .background(Color.White)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Face,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically),
                                tint = Color.Red
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "Валикова Светлана Юрьевна",
                                    fontSize = 16.sp,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Прочее",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
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
                Box (modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(95.dp)){
                    ElevatedCard(
                        modifier = Modifier.align(Alignment.TopStart),
                        elevation = CardDefaults.cardElevation(0.dp),
                        shape = RoundedCornerShape(0.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                                .background(Color.White)
                        ) {
                            Text(
                                text = "ЧЛЕНСТВА",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                        }
                    }
                    ElevatedCard(
                        onClick = { /*TODO*/ },
                        elevation = CardDefaults.cardElevation(0.dp),
                        shape = RoundedCornerShape(0.dp),
                        modifier = Modifier.align(Alignment.BottomStart)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                                .background(Color.White)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.Star,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically),
                                tint = Color.Red
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "Базовое членство 12 мес 60 дней/з",
                                    fontSize = 16.sp,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Активно до 10.03.2025",
                                    fontSize = 12.sp,
                                    color = Color.Green
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Без ограничений",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
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
                Box (modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(100.dp)){
                    ElevatedCard(
                        modifier = Modifier.align(Alignment.TopStart),
                        elevation = CardDefaults.cardElevation(0.dp),
                        shape = RoundedCornerShape(0.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                                .background(Color.White)
                        ) {
                            Text(
                                text = "ПАКЕТЫ",
                                fontSize = 14.sp,
                                color = Color.Gray
                            )
                        }
                    }
                    ElevatedCard(
                        onClick = { /*TODO*/ },
                        elevation = CardDefaults.cardElevation(0.dp),
                        shape = RoundedCornerShape(0.dp),
                        modifier = Modifier.align(Alignment.BottomStart)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(6.dp)
                                .background(Color.White)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.CheckCircle,
                                contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically),
                                tint = Color.Red
                            )
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "Стартовый пакет базовые 275 дней",
                                    fontSize = 16.sp,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Активно до 13.10.2024",
                                    fontSize = 12.sp,
                                    color = Color.Green
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Осталось 7 услуг",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
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
        }
    }
}