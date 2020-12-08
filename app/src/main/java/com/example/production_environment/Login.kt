package com.example.production_environment

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class Login : AppCompatActivity() {

    private var _userId = -1
    private val _helper = DatabaseHelper(this@Login)

    private var _client_information = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //デバイスIDを取得
        val androidid: String =
            Settings.Secure.getString(contentResolver, Settings.System.ANDROID_ID)

        //入力したユーザー名を取得する
        val inputN = findViewById<EditText>(R.id.inputName)

        val test = findViewById<TextView>(R.id.textView3)
        //AndroidIDのデバック
//        test.setText(androidid)

        //ボタンのリスナー設定
        btn_save.setOnClickListener{

            val inputUsername = inputN.text.toString()

            //データベースヘルパーオブジェクトからデータベース接続オブジェクトを取得。
            val db = _helper.writableDatabase

            val sqlDelete = "DELETE FROM client_information"
            //SQL文字列を元にプリペアドステートメントを取得。1-3
            var stmt = db.compileStatement(sqlDelete)
            //変数のバイド。1-4
//            stmt.bindLong(1, _client_information.toLong())
            //削除SQLの実行。1-5
            stmt.executeUpdateDelete()

            //インサート用SQL文字列の用意
            val sqlInsert = "INSERT INTO client_information (_id, username, android_id) VALUES (?, ?, ?)"
            //SQL文字列を元にプリペアドステートメントを取得。
            stmt = db.compileStatement(sqlInsert)
            //変数のバイド。
            stmt.bindLong(1, _userId.toLong())
            stmt.bindString(2, inputUsername)
            stmt.bindString(3, androidid)
            //インサートSQLの実行。
            stmt.executeInsert()

            //入力したユーザー名を確認デバック
//            test.setText(inputUsername)

            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }

    override fun onDestroy() {
        //ヘルパーオブジェクトの開放。
        _helper.close()
        super.onDestroy()
    }
}