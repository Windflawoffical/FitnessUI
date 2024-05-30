package com.example.fitnessui.ui.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.filled.Warning
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitnessui.R
import com.example.fitnessui.Screen
import com.example.fitnessui.ui.element.BottomNavBar


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(
    navController: NavController
) {
    Scaffold (bottomBar = { BottomNavBar(navController = navController) }, topBar = { CenterAlignedTopAppBar(
        title = { Text(text = "Ещё") })
    }) {
        LazyColumn (Modifier.padding(it), contentPadding = PaddingValues(5.dp)) {
            item {
                ElevatedCard(
                    onClick = { navController.navigate(Screen.ScheduleScreen.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.DateRange,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Расписание",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Face,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Диагностика и массаж",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ThumbUp,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Мои занятия",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { navController.navigate(Screen.NewsScreen.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = ImageVector.vectorResource(id = R.drawable.icon_news),
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Новости",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "О клубе",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { navController.navigate(Screen.ProfileScreen.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Личный кабинет",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.ShoppingCart,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Магазин",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Call,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Позвонить в клуб",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Сайт",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }
                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Warning,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Техника безопасности",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Обратная связь",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { /*TODO*/ }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Info,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "О приложении",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                ElevatedCard(
                    onClick = { navController.navigate(Screen.NotificationScreen.route) }
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.White)
                    ) {
                        Icon(
                            imageVector = Icons.Default.Notifications,
                            contentDescription = null,
                            modifier = Modifier
                                .size(20.dp)
                                .align(CenterVertically),
                            tint = Color.Red
                        )
                        Spacer(modifier = Modifier.width(12.dp))
                        Text(
                            text = "Уведомления",
                            fontSize = 20.sp,

                            modifier = Modifier.align(CenterVertically)
                        )
                        Spacer(modifier = Modifier.weight(1.0f))
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = null,
                            modifier = Modifier
                                .size(25.dp)
                                .align(CenterVertically)
                        )
                    }
                }

            }
        }

    }
}
