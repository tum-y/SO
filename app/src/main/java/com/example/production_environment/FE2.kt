package com.example.production_environment




import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_f_e.*
import kotlinx.android.synthetic.main.activity_past_q.back_btn


class FE : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_e)

        //戻るボタン
        back_btn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
        //OKボタン
        ok_btn.setOnClickListener {
            // val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

        val checkBox1 = arrayOfNulls<CheckBox>(2)

        checkBox1[0] = findViewById(R.id.cb1)
        checkBox1[0]?.setChecked(false)
        checkBox1[0]?.setOnClickListener({
            val nigate = checkBox1[0]!!.isChecked
            //選択分岐　チェック済み処理
            if (nigate) {
              //ニガテ・チェックされたら希望の選択問題数と合わせて出題する

            } else {
                //チェックが外されたら
            }
        })




//年代の処理
        val Button1 = findViewById<TextView>(R.id.fe_age)
            Button1.setTextColor(Color.BLACK)
            Button1.setOnClickListener {
                val dialog = fe_S_Dialog()
                dialog.show(supportFragmentManager, "問題１")
            }

        val Button2 = findViewById<TextView>(R.id.fe_Season)
        Button2.setTextColor(Color.BLACK)
         Button2.setOnClickListener {
            val dialog = season()
            dialog.show(supportFragmentManager, "問題１")
         }

        val Button3 = findViewById<TextView>(R.id.fe_field)
        Button3.setTextColor(Color.BLACK)
        Button3.setOnClickListener {
            val dialog = field()
            dialog.show(supportFragmentManager, "問題１")
        }

        val Button4 = findViewById<TextView>(R.id.fe_issue)
        Button4.setTextColor(Color.BLACK)
        Button4.setOnClickListener {
            val dialog = issue()
            dialog.show(supportFragmentManager, "問題１")
        }

//シャッフル出題デフォルトでチェック
        //チェックなしで決定の場合、エラーダイヤログ
        //問題数のみ、エラー
//シャッフル出題の場合、下の年代、季節、分野　出題問題ロック
        // ニガテ問題に関しても同様
        //問題数もひとつ選択のみ
        //






    }


    }








