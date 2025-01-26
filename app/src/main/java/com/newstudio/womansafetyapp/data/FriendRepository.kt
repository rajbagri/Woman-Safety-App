package com.newstudio.womansafetyapp.data

import kotlinx.coroutines.flow.Flow

class FriendRepository(private val friendDao: FriendDao) {

    suspend fun addFriend(friend : Friend) = friendDao.addFriend(friend)

    fun getWish() : Flow<List<Friend>> = friendDao.getAllFriend()

    suspend fun updateFriend(friend: Friend) = friendDao.updateWish(friend)

    suspend fun deleteWish(friend : Friend) = friendDao.deleteWish(friend)

}