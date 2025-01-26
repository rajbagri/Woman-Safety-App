package com.newstudio.womansafetyapp

sealed class Screen(val route : String){

    object HomeScreen : Screen("home_screen")
    object AddFriend : Screen("add_friend")

}