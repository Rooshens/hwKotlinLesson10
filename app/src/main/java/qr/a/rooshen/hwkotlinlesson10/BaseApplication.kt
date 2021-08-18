package qr.a.rooshen.hwkotlinlesson10

import android.app.Application
import androidx.room.Room
import qr.a.rooshen.hwkotlinlesson10.database.AppDatabase

class BaseApplication:Application() {

    companion object{
        var instance: AppDatabase? = null
    }

    override fun onCreate() {
        super.onCreate()
        instance = Room
            .databaseBuilder(this,AppDatabase::class.java,"RushenBase")
            .allowMainThreadQueries()
            .fallbackToDestructiveMigration()
            .build()
        SharePrefHelper.initPrefences(this)
    }
}