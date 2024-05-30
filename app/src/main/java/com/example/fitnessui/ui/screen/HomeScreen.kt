package com.example.fitnessui.ui.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.CardColors
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.fitnessui.R
import com.example.fitnessui.Screen
import com.example.fitnessui.ui.element.BottomNavBar


@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(
    navController: NavController
) {
    Scaffold (bottomBar = { BottomNavBar(navController = navController) }, topBar = { CenterAlignedTopAppBar(
        title = { Text(text = "I LOVE Б5") },
        actions = {
            IconButton(onClick = { /*TODO*/ }) {
                Icon(imageVector = Icons.Default.Call, contentDescription = null, modifier = Modifier.size(28.dp), tint = Color.Black)
            }
            IconButton(onClick = { navController.navigate(Screen.NotificationScreen.route) }) {
            Icon(imageVector = Icons.Default.Notifications, contentDescription = null, modifier = Modifier.size(28.dp),
                tint = if (navController.currentBackStackEntry?.destination?.route == Screen.NotificationScreen.route) Color.Red else Color.Black)
            }
        }
    )
    }) {
        LazyColumn (Modifier.padding(it)) {
            item {
                Image(
                    painter = painterResource(id = R.drawable.fit),
                    contentDescription = null
                )
            }
            item {
                ElevatedCard(
                    onClick = { /*TODO*/ },
                    colors = CardDefaults.cardColors(Color.Red),
                    elevation = CardDefaults.cardElevation(0.dp),
                    shape = RoundedCornerShape(0.dp)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(6.dp)
                            .background(Color.Red),

                    ) {
                        Spacer(modifier = Modifier.width(20.dp))
                        Spacer(modifier = Modifier.weight(1.0f))
                        Column (horizontalAlignment = Alignment.End){
                            val random = (0..350).random()
                            Text(
                                text = random.toString(),
                                fontWeight = FontWeight.Bold,
                                color = Color.White,
                                fontSize = 24.sp,
                            )
                            Text(
                                text = "Текущая загруженность клуба",
                                color = Color.White,
                                fontSize = 14.sp,
                            )
                        }
                    }
                }
            }
            item {
                Image(
                    painter = painterResource(id = R.drawable.home_photo),
                    contentDescription = null
                )
            }
        }
    }
}