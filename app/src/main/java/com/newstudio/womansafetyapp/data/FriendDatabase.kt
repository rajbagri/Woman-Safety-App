package com.newstudio.womansafetyapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [Friend::class],
    version = 1,
    exportSchema = false
)

abstract class FriendDatabase : RoomDatabase() {

    abstract fun friendDao() : FriendDao

}