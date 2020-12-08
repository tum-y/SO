package com.example.production_environment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_s_g.*

class SG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_s_g)

        //過去問演習へ戻る
        back_btn.setOnClickListener {
            val intent = Intent(this, Past_q::class.java)
            startActivity(intent)
        }
    }
}