package com.example.fitnessui.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
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
fun NewsScreen(
    navController: NavController
) {
    Scaffold (bottomBar = { BottomNavBar(navController = navController) }, topBar = { CenterAlignedTopAppBar(
        title = { Text(text = "Новости") })
    }) {
        LazyColumn (Modifier.padding(it)) {
            item {
                Box (modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(50.dp)){
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
                            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.b5_icon), contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically),)
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "I LOVE Б5",
                                    fontSize = 16.sp,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "23 мая 2024 19:09",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.weight(1.0f))
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Share, contentDescription = null, modifier = Modifier
                                    .size(20.dp)
                                    .align(Alignment.CenterVertically))
                            }
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.third_news),
                    contentDescription = null
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .background(Color.White)
                ) {
                    Column {
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
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "ещё", color = Color.Red, modifier = Modifier.align(Alignment.CenterVertically))
                    }
                }
            }
            item {
                Box (modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(50.dp)){
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
                            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.b5_icon), contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically),)
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "I LOVE Б5",
                                    fontSize = 16.sp,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "23 мая 2024 19:09",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.weight(1.0f))
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Share, contentDescription = null, modifier = Modifier
                                    .size(20.dp)
                                    .align(Alignment.CenterVertically))
                            }
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.second_news),
                    contentDescription = null
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .background(Color.White)
                ) {
                    Column {
                        Text(
                            text = "✨ Летняя смена нашего фитнес-лагеря",
                            fontSize = 14.sp,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "\uD83E\uDD70 Бассейн, 3-х разовое питание, творчество!",
                            fontSize = 14.sp,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "\uD83D\uDD5C Спешите записаться!",
                            fontSize = 14.sp,
                        )
                    }
                    Spacer(modifier = Modifier.weight(1.0f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "ещё", color = Color.Red, modifier = Modifier.align(Alignment.CenterVertically))
                    }
                }
            }
            item {
                Box (modifier = Modifier
                    .padding(5.dp)
                    .fillMaxWidth()
                    .height(50.dp)){
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
                            Icon(imageVector = ImageVector.vectorResource(id = R.drawable.b5_icon), contentDescription = null,
                                modifier = Modifier
                                    .size(32.dp)
                                    .align(Alignment.CenterVertically),)
                            Spacer(modifier = Modifier.width(12.dp))
                            Column {
                                Text(
                                    text = "I LOVE Б5",
                                    fontSize = 16.sp,
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "23 мая 2024 19:09",
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                            Spacer(modifier = Modifier.weight(1.0f))
                            IconButton(onClick = { /*TODO*/ }) {
                                Icon(imageVector = Icons.Default.Share, contentDescription = null, modifier = Modifier
                                    .size(20.dp)
                                    .align(Alignment.CenterVertically))
                            }
                        }
                    }
                }
                Image(
                    painter = painterResource(id = R.drawable.first_news),
                    contentDescription = null
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(6.dp)
                        .background(Color.White)
                ) {
                    Column {
                        Text(
                            text = "\uD83D\uDD25 ВЫГОДНОЕ ПРЕДЛОЖЕНИЕ",
                            fontSize = 14.sp,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "\uD83D\uDD52 До 31.05 продли КАРТУ выгодно!",
                            fontSize = 14.sp,
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                        Text(
                            text = "\uD83C\uDFF7\uFE0F Всего за 2900 руб/мес!",
                            fontSize = 14.sp,
                        )
                    }
                    Spacer(modifier = Modifier.weight(1.0f))
                    TextButton(onClick = { /*TODO*/ }) {
                        Text(text = "ещё", color = Color.Red, modifier = Modifier.align(Alignment.CenterVertically))
                    }
                }
            }
        }
    }
}