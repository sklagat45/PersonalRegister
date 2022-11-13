package com.sklagat46.salicprac.repository

import com.sklagat46.salicprac.data.UserDao
import com.sklagat46.salicprac.models.User
import androidx.lifecycle.LiveData

class UserRepository(private val userDao: UserDao) {

    val readAllData: LiveData<List<User>> = userDao.readAllData()

    suspend fun addUser(user: User){
        userDao.addUser(user)
    }

    suspend fun updateUser(user:User){
        userDao.update(user)
    }

    suspend fun deleteUser(user: User){
        userDao.deleteUser(user)
    }

    suspend fun deleteAllUsers(){
        userDao.deleteAlaaUsers()
    }

}
