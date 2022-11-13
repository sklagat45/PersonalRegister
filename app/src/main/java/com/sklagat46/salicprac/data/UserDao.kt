package com.sklagat46.salicprac.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.sklagat46.salicprac.models.User


@Dao
interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addUser(user: User)

    @Update
    suspend fun update(user:User)
    @Delete
    suspend fun deleteUser(user: User)
    @Query("DELETE FROM user_table")
    suspend fun deleteAlaaUsers()


    @Query("SELECT * FROM user_table ORDER BY id ASC")
    fun readAllData():LiveData<List<User>>


}