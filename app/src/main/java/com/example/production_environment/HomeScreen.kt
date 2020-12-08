package com.example.production_environment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_home_screen.*
import java.util.*

class HomeScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_screen)

        //homeから過去問題へ画面移行
        past_q_btn.setOnClickListener {
            val intent = Intent(this, Past_q::class.java)
            startActivity(intent)

        }
        //homeからテストへ画面移行
        test_btn.setOnClickListener {
            val intent = Intent(this, Test::class.java)
            startActivity(intent)

        }

        //homeから単語帳へ画面移行
        v_book_btn.setOnClickListener {
            val intent = Intent(this, V_book::class.java)
            startActivity(intent)
        }

        //homeからストーリーへ画面移行
        story_btn.setOnClickListener {
            val intent = Intent(this, Story::class.java)
            startActivity(intent)
        }

        //homeから成績へ画面移行
        grade_btn.setOnClickListener {
            val intent = Intent(this, Cal_g::class.java)
            startActivity(intent)
        }
        //homeから設定へ画面変更
        conf_btn.setOnClickListener {
            val intent = Intent(this, Conf::class.java)
            startActivity(intent)
        }


        //時刻表示するコード(日付表示)
        val cal = Calendar.getInstance() //カレンダーを取得
        val iYear = cal[Calendar.YEAR] //年を取得
        val iMonth = cal[Calendar.MONTH] //月を取得
        val iDate = cal[Calendar.DATE] //日を取得
        val strDay = iYear.toString() + "年" + (iMonth+1) + "月" + iDate + "日" //日付を表示形式で設定
        val cal_btn = findViewById(R.id.cal_btn) as TextView
        cal_btn.setText(strDay)
    }
}