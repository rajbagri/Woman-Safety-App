package com.newstudio.womansafetyapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.newstudio.womansafetyapp.data.Friend
import com.newstudio.womansafetyapp.data.FriendRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddFriendViewModel : ViewModel() {

    private val friendRepository : FriendRepository = Graph.friendRepository

    var friendName by mutableStateOf("")
    var friendNumber by mutableStateOf("")

    fun onFriendNameChanged(newName : String){
        friendName = newName
    }

    fun onFriendNumberChanged(newNumber : String){
        friendNumber = newNumber
    }

    fun addFriend(friend : Friend){
        viewModelScope.launch(Dispatchers.IO) {
            friendRepository.addFriend(friend)
        }
    }



}