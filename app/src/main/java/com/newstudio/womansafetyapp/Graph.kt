package com.newstudio.womansafetyapp

import android.content.Context
import androidx.room.Room
import androidx.room.RoomDatabase
import com.newstudio.womansafetyapp.data.FriendDatabase
import com.newstudio.womansafetyapp.data.FriendRepository

object Graph {

    lateinit var database: FriendDatabase

    val friendRepository by lazy{
        FriendRepository(friendDao = database.friendDao())
    }

    fun provide(context : Context){
        database = Room
            .databaseBuilder(
                context,
                FriendDatabase::class.java,
                "friendList.db"
            ).build()
    }

}