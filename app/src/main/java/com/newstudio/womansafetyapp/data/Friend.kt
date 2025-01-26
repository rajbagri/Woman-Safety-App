package com.newstudio.womansafetyapp.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "friend_table")
data class Friend(
    @PrimaryKey(autoGenerate = true)
    val id : Long = 0L,
    val name : String = "",
    val num : String = ""
)