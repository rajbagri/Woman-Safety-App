package com.newstudio.womansafetyapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface FriendDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addFriend(friendEntity : Friend)

    @Query("Select * from `friend_table`")
    fun getAllFriend() : Flow<List<Friend>>

    @Update
    suspend fun updateWish(friendEntity : Friend)

    @Delete
    suspend fun deleteWish(friendEntity : Friend)



}