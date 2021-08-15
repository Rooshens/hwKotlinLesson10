package qr.a.rooshen.hwkotlinlesson10

import android.content.Context
import android.content.SharedPreferences

class SharePrefHelper {

    companion object{
        val SHARED_PREF_NAME = "settingsHWKotlinlesson9"
        val SP_WELCOME_BUTTON_ClIKED = "notShowItAnymore"
        lateinit var instance: SharedPreferences
        fun initPrefences(context: Context){
            instance = context.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE)
        }
    }

}