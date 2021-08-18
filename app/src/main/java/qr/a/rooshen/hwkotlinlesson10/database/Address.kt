package qr.a.rooshen.hwkotlinlesson10.database

import androidx.room.Entity

@Entity
class Address(
    val city: String,
    val street: String,
    val houseId: Int,
    val flatId:Int
) {
}