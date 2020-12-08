package com.example.production_environment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_past_q.*

class Past_q : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_past_q)

        //FEへ画面移行
        FE_btn.setOnClickListener {
            val intent = Intent(this,FE::class.java)
            startActivity(intent)
        }

        //SGへ画面移行
        SG_btn.setOnClickListener {
            val intent = Intent(this,SG::class.java)
            startActivity(intent)
        }

        //homeへ戻る
        back_btn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
    }
}