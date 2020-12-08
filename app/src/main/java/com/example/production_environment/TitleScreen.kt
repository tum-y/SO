package com.example.production_environment

import android.content.Intent
import android.os.AsyncTask
import android.os.Bundle
import android.provider.Settings
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_title_screen.*
import java.io.BufferedReader
import java.io.IOException
import java.io.InputStream
import java.io.InputStreamReader
import java.net.HttpURLConnection
import java.net.URL
import java.nio.file.attribute.AclEntry
import java.text.SimpleDateFormat
import java.util.*


class TitleScreen : AppCompatActivity() {

    //ログイン時刻取得
    fun getToday(): String {
        val date = Date()
        val format = SimpleDateFormat("yyyyMMdd", Locale.getDefault())
        return format.format(date)
    }

    private val _helper = DatabaseHelper(this@TitleScreen)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title_screen)

        val data = getToday()

        val pref = getSharedPreferences(packageName + "_preferences", MODE_PRIVATE)
        val last_time = pref.getString("LOGIN_TIME", null)

        val editor = pref.edit()
        editor.putString("LOGIN_TIME", data)

        // 一日の最初のログイン時にテストフラグを立てる
        if (last_time != data) {
            editor.putBoolean("TEST_FLAG", true)
        }
        editor.apply()

        //デバック用
//        val t = pref.getBoolean("TEST_FLAG", false).toString()
//        val test = findViewById<TextView>(R.id.subtitle)
//        test.setText(t)

        val androidid: String =
            Settings.Secure.getString(contentResolver, Settings.System.ANDROID_ID)

        title_start_btn.setOnClickListener {

            val db = _helper.writableDatabase
            val sql = "SELECT * FROM client_information WHERE android_id=?"
            val information = db.rawQuery(sql, arrayOf(androidid))
            var newuser = ""

//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)

            while (information.moveToNext()) {
                val androidid_ind = information.getColumnIndex("android_id")
                newuser = information.getString(androidid_ind)
            }
            if (newuser.isNullOrBlank()) {
                val intent = Intent(this, Login::class.java)
                startActivity(intent)
//                デバック用
//                val test = findViewById<TextView>(R.id.subtitle)
//                test.setText(newuser)
            } else {
                val intent = Intent(this, HomeScreen::class.java)
                startActivity(intent)
//                デバック用
//                val test = findViewById<TextView>(R.id.subtitle)
//                test.setText("aaa")
            }
        }
    }

    override fun onDestroy() {
        //ヘルパーオブジェクトの開放。
        _helper.close()
        super.onDestroy()
    }


}