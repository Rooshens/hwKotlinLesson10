package qr.a.rooshen.hwkotlinlesson10.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface UserDao {

    @Query("SELECT * FROM users")
    fun getUsers(): List<User>

    @Query("SELECT * FROM users WHERE name=:nameId")
    fun getUserById(nameId: String):Boolean

    @Insert
    fun insert(user: User)

}