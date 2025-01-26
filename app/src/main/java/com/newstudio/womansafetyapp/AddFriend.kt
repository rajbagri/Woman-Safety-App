package com.newstudio.womansafetyapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.newstudio.womansafetyapp.data.Friend

@Composable
fun AddFriend(addFriendViewModel: AddFriendViewModel) {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(0xFFF5DBDF)),
        verticalArrangement = Arrangement.Center
    ) {


        Text(
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center,
            text = "Add Friend",
            fontWeight = FontWeight.Bold,
            fontSize = 50.sp
        )


        OutlinedTextField(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            value = addFriendViewModel.friendName,
            onValueChange = { newName ->
                addFriendViewModel.onFriendNameChanged(newName)
            },
            colors = TextFieldDefaults.colors(
                focusedContainerColor = Color.White,
                unfocusedContainerColor = Color.White
            )
        )

        Row(
            modifier = Modifier
                .height(70.dp)
                .padding(start = 10.dp, top = 10.dp, end = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {

            OutlinedTextField(
                modifier = Modifier
                    .fillMaxWidth(0.8f)
                    .fillMaxHeight()
                    ,
                value = addFriendViewModel.friendNumber,
                onValueChange = { newName ->
                    addFriendViewModel.onFriendNumberChanged(newName)
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.White,
                    unfocusedContainerColor = Color.White
                )
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 10.dp),
                colors = CardDefaults.cardColors(containerColor = Color(0xFFFF6984))
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.contact),
                    contentDescription = ""
                )
            }
        }

         Row (
             modifier = Modifier
                 .fillMaxWidth()
                 .padding(top = 10.dp),
             horizontalArrangement = Arrangement.Center
         ){
             Button(
                 onClick = {
                     addFriendViewModel.addFriend(
                         friend = Friend(
                             name = addFriendViewModel.friendName,
                             num = addFriendViewModel.friendNumber
                         )
                     )
                 },
                 colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF6984))
             ) {
                Text(fontSize = 15.sp, text = "Add Friend")

             }
         }



    }

}

@Composable
@Preview(showBackground = true)
fun PreviewAddPeople(){
    AddFriend(AddFriendViewModel())
}