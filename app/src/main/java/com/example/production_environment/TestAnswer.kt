package com.example.production_environment

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test__f_e__answer.*

class TestAnswer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test__f_e__answer)
        val sum_result = findViewById<TextView>(R.id.textView5)
        val myanswer1 = findViewById<TextView>(R.id.myanswer1)
        val myanswer2 = findViewById<TextView>(R.id.myanswer2)
        val myanswer3 = findViewById<TextView>(R.id.myanswer3)
        val myanswer4 = findViewById<TextView>(R.id.myanswer4)


        val count = intent.getIntExtra("Count", 0)

        if (count == 5){
            val sum = intent.getIntExtra("Sum", 0)
//            sum_result.setText(sum.toString() + "/" + (count - 1).toString() + "正解")
            button.setText("終了")
        }else{
            finish()
        }

        val myanswer = intent.getStringArrayListExtra("Myanswer")
        var i = 1
        for(text in myanswer.orEmpty()){
            if(i == 1){
                myanswer1.setText(text.toString())
            }else if(i == 2){
                myanswer2.setText(text.toString())
            }else if(i == 3){
                myanswer3.setText(text.toString())
            }else if(i == 4){
                myanswer4.setText(text.toString())
            }
            sum_result.setText(myanswer.toString())
            i += 1
        }

        button.setOnClickListener{
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}