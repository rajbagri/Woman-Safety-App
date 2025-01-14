package com.newstudio.womansafetyapp

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeView() {

    Box(modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
    ){

        Image(
            modifier = Modifier.fillMaxSize(),
            painter = painterResource(id = R.drawable.background),
            contentDescription = "",
            contentScale = ContentScale.FillBounds
        )

        Column(
            modifier = Modifier
            .fillMaxSize()
        ) {

            Text(
                modifier = Modifier.padding(20.dp),
                text = "Bsafe",
                fontSize = 30.sp,
                color = Color.White
            )

            Column(
                modifier = Modifier
                    .fillMaxHeight(0.18f)
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

                    Text(
                        modifier = Modifier
                            .padding(start = 10.dp),
                        text = "Raj Bagri",
                        color = Color.White,
                        fontSize = 20.sp
                    )

                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                    verticalAlignment = Alignment.Bottom
                ) {

                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(text = "Current Location", color = Color.White)
                        Spacer(modifier = Modifier.height(5.dp))
                        Text(text = "Bhopal, Madhya Pradesh", color = Color.White)
                        Spacer(modifier = Modifier.height(5.dp))
                    }

                }
            }



            Card(
                modifier = Modifier
                    .fillMaxSize(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(40.dp)
            ) {

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically
                ){

                    Column() {
                        Text(
                            modifier = Modifier
                                .fillMaxWidth(0.7f)
                                .padding(top = 15.dp, start = 15.dp),
                            text = "Are you in Emergency?",
                            fontSize = 30.sp,
                            color = Color.Black
                        )

                        Text(
                            modifier = Modifier
                                .fillMaxWidth(0.68f)
                                .padding(start = 15.dp, top = 10.dp),
                            text = "Press the SOS button, your live location will be shared with the nearest help centre and your emergency contacts",
                            color = Color.Black,
                            lineHeight = 16.sp,
                            fontSize = 13.sp
                        )
                    }

                    Image(
                        painter = painterResource(id = R.drawable.woman),
                        contentDescription = ""
                    )

                }

                Card(modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(0.42f)
                    .padding(top = 15.dp),
                    colors = CardDefaults.cardColors(containerColor = Color(0xFFFAFAFA)),
                    shape = RoundedCornerShape(30.dp)

                ) {

                    Row (
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ){
                        Image(
                            painter = painterResource(id = R.drawable.sos),
                            contentDescription = ""
                        )
                    }

                }


            }


        }



    }

}

@Composable
@Preview(showBackground = true)
fun PreviewHomeView(){
    HomeView()
}