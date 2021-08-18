package qr.a.rooshen.hwkotlinlesson10.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 2)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getUserDao(): UserDao

}