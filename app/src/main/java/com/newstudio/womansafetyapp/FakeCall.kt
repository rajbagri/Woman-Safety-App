package com.newstudio.womansafetyapp

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun FakeCall() {

    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "Fake Call",
            fontWeight = FontWeight.Bold,
            fontSize = 30.sp
        )

        Text(
            text = "The Fake Call feature allows users to simulate on incoming" +
                " at any moment, providing a discreet way to escape uncomfortable or" +
                " potentially dangerous situations",

            )
    }

}

@Composable
@Preview(showBackground = true)
fun PreviewFakeCall(){
    FakeCall()
}