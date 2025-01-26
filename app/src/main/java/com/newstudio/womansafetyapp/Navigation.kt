package com.newstudio.womansafetyapp

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun Navigation(navController : NavHostController) {

    NavHost(navController = navController, startDestination = Screen.HomeScreen.route){
        composable(Screen.HomeScreen.route){
            HomeView(navController)
        }

        composable(Screen.AddFriend.route){
            AddFriend(addFriendViewModel = AddFriendViewModel())
        }
    }

}