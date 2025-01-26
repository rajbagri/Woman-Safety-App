package com.newstudio.womansafetyapp

import android.graphics.drawable.shapes.OvalShape
import android.graphics.drawable.shapes.Shape
import android.widget.Space
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeView(navController: NavController) {

    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .background(color = Color(0xFFFF6984))
    ){


        Column(
            modifier = Modifier
            .fillMaxSize()
        ) {



            Column(
                modifier = Modifier
                    .fillMaxHeight(0.23f),
                verticalArrangement = Arrangement.Center
            ) {

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){

                    Card(modifier = Modifier
                        .padding(start = 10.dp)
                        .height(50.dp),
                        shape = CircleShape
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.ic_launcher_background),
                            contentDescription = "",
                        )

                    }

                    Column() {

                        Text(
                            modifier = Modifier
                                .padding(start = 10.dp),
                            text = "Hey there,",
                            color = Color.White,
                            fontSize = 15.sp
                        )

                        Text(
                            modifier = Modifier
                                .padding(start = 10.dp),
                            text = "Riya",
                            color = Color.White,
                            fontSize = 25.sp
                        )
                    }


                }

            }

            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(40.dp),

                ) {

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(10.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    verticalAlignment = Alignment.Bottom,

                    ){

                    Card(
                        modifier = Modifier
                            .height(140.dp)
                            .fillMaxWidth(0.5f)
                            .padding(10.dp)
                            .shadow(
                                10.dp,
                                shape = RoundedCornerShape(25.dp),
                                ambientColor = Color.Black
                            ),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF9F9)),
                        shape = RoundedCornerShape(25.dp),
                        border = BorderStroke(width = 0.2.dp, Color(0xFFFA92AF)),
                    ) {

                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.phone),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(5.dp),
                                text = """Fake Calls""".trimMargin(),
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold
                            )
                        }

                    }

                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(140.dp)
                            .padding(10.dp)
                            .shadow(
                                10.dp,
                                shape = RoundedCornerShape(25.dp),
                                ambientColor = Color.Red
                            ),
                        colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF9F9)),
                        border = BorderStroke(width = 0.2.dp, Color(0xFFFA92AF)),
                        shape = RoundedCornerShape(25.dp),
                        elevation = CardDefaults.cardElevation(5.dp)

                    ) {

                        Column(
                            modifier = Modifier.fillMaxSize(),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.live_location),
                                contentDescription = ""
                            )
                            Text(
                                modifier = Modifier.padding(5.dp),
                                lineHeight = 15.sp,
                                fontSize = 13.sp,
                                text = """Share Live
                                        | Location""".trimMargin(),
                                fontWeight = FontWeight.Bold

                            )
                        }

                    }

                }

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .padding(start = 20.dp, end = 20.dp)
                        .shadow(
                            10.dp,
                            shape = RoundedCornerShape(25.dp),
                            ambientColor = Color.Red
                        ),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFFF9F9)),
                    border = BorderStroke(width = 0.2.dp, Color(0xFFFA92AF)),
                    shape = RoundedCornerShape(5.dp),
                    elevation = CardDefaults.cardElevation(5.dp)

                ) {

                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Column(
                        ) {
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(0.5f)
                                    .padding(start = 15.dp, bottom = 5.dp),
                                text = "Add Close People",
                                fontWeight = FontWeight.Bold,
                                fontSize = 17.sp
                            )
                            Text(
                                modifier = Modifier
                                    .fillMaxWidth(0.5f)
                                    .padding(start = 15.dp),
                                text = "Add close people and friends for sos",

                                lineHeight = 12.sp,
                                fontSize = 12.sp
                            )
                        }

                        Button(
                            modifier = Modifier
                                .padding(5.dp)
                                .wrapContentSize(),
                            onClick = {
                                navController.navigate(Screen.AddFriend.route)
                            },
                            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF6984)),
                            shape = RoundedCornerShape(20.dp)
                        ) {
                            Text(text = "Add friends")
                            Spacer(modifier = Modifier.width(5.dp))
                            Icon(painter = painterResource(id = R.drawable.add_person), contentDescription = "")
                        }

                    }


                }


            }





        }



    }

}

@Composable
@Preview(showBackground = true)
fun PreviewHomeView(){
    val context = LocalContext.current
    HomeView(NavController(context))
}