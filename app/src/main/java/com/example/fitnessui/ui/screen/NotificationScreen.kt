package com.example.fitnessui.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitnessui.R
import com.example.fitnessui.ui.element.BottomNavBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NotificationScreen(
    navController: NavController
) {
    Scaffold (bottomBar = { BottomNavBar(navController = navController) }, topBar = { CenterAlignedTopAppBar(
        title = { Text(text = "Уведомления") })
    }) {
        LazyColumn (Modifier.padding(it)) {
            item {
                OutlinedCard (elevation = CardDefaults.cardElevation(0.dp), shape = RoundedCornerShape(0.dp)) {
                    Row(

                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                            .clickable { /*TODO*/ }
                    ) {
                        Column {
                            Text(
                                text = "23 мая 2024 19:09",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                            Text(
                                text = "\uD83D\uDD25 Спешите! Только до 16 Мая!",
                                fontSize = 14.sp,
                            )
                            Text(
                                text = "ОДНА КАРТА НА ВСЮ СЕМЬЮ!",
                                fontSize = 14.sp,
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "\uD83C\uDF81 Взрослая карта в подарок!",
                                fontSize = 14.sp,
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "\uD83C\uDF81 Детская карта в подарок!",
                                fontSize = 14.sp,
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
            item {
                OutlinedCard (elevation = CardDefaults.cardElevation(0.dp), shape = RoundedCornerShape(0.dp)) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Column {
                            Text(
                                text = "22 мая 2024 14:09",
                                fontSize = 12.sp,
                                color = Color.Gray
                            )
                            Text(
                                text = "Важная информация!",
                                fontSize = 14.sp,
                            )
                            Text(
                                text = "Уважаемые гости!",
                                fontSize = 14.sp,
                            )
                            Text(
                                text = "В период с 27 мая по 5 июня плановое отключение",
                                fontSize = 14.sp,
                            )
                            Text(
                                text = "горячего водоснабжения.",
                                fontSize = 14.sp,
                            )
                            Text(
                                text = "В клубе установлены бойлеры, возможны перепады",
                                fontSize = 14.sp,
                            )
                            Text(
                                text = "температуры воды!",
                                fontSize = 14.sp,
                            )
                        }
                    }
                }
            }
        }
    }
}