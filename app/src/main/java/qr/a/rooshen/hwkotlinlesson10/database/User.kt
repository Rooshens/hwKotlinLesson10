package qr.a.rooshen.hwkotlinlesson10.database

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey

@Entity(tableName = "users")
class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "userID")
    val id: Int = 0,
    val name: String

) {
    @Ignore
    val isAuthorized: Boolean = false


}