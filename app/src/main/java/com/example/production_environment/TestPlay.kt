package com.example.production_environment

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_test_play.*

class TestPlay : AppCompatActivity() {

    private val _helper = DatabaseHelper(this@TestPlay)
    private var correct = ""
    private var count = 1
    private var sum = 0
    private var answer: MutableList<String> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test_play)
    }

    override fun onResume() {
        super.onResume()

        val maintext_view = findViewById<TextView>(R.id.maintext)
        val answer1 = findViewById<RadioButton>(R.id.answer1_btn)
        val answer2 = findViewById<RadioButton>(R.id.answer2_btn)
        val answer3 = findViewById<RadioButton>(R.id.answer3_btn)
        val answer4 = findViewById<RadioButton>(R.id.answer4_btn)
        val question = findViewById<TextView>(R.id.textView6)
        val mode = findViewById<TextView>(R.id.textView3)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        radioGroup.check(R.id.answer1_btn)

        val db = _helper.writableDatabase
        val sql = "SELECT * FROM issue_list WHERE issue_id = ?"
        val information = db.rawQuery(sql, arrayOf(count.toString()))
        while (information.moveToNext()) {
            maintext_view.setText(information.getString(information.getColumnIndex("sentence")))
            var answerlist = listOf<String>(
                information.getString(information.getColumnIndex("answer")),
                information.getString(information.getColumnIndex("answer_choice1")),
                information.getString(information.getColumnIndex("answer_choice2")),
                information.getString(information.getColumnIndex("answer_choice3"))
            )
            answerlist = answerlist.shuffled()

            correct = information.getString(information.getColumnIndex("answer"))

            val pref = getSharedPreferences(packageName + "SelectionMode", MODE_PRIVATE)
            val modeString = pref.getString("SelectionMode", null)
            question.setText("問" + count.toString())
            answer1.setText(answerlist[0])
            answer2.setText(answerlist[1])
            answer3.setText(answerlist[2])
            answer4.setText(answerlist[3])
            mode.setText(modeString)

        }

        //解答する
        next_btn.setOnClickListener {
            val id = radioGroup.checkedRadioButtonId
            val checkedRadioButton = findViewById<RadioButton>(id)
            val intent = Intent(this, TestAnswer::class.java)
            if (correct == checkedRadioButton.text) {
                count += 1
                sum += 1
                answer.add("正解")
                intent.putExtra("Count", count).putExtra("Sum", sum).putStringArrayListExtra("Myanswer", answer as ArrayList<String>)
                startActivity(intent)
            } else {
                count += 1
                answer.add("不正解")
                intent.putExtra("Count", count).putExtra("Sum", sum).putStringArrayListExtra("Myanswer", answer as ArrayList<String>)
                startActivity(intent)
            }


            if (count == 5){
                finish()
            }
        }
    }

        override fun onDestroy() {
            //ヘルパーオブジェクトの開放。
            _helper.close()
            super.onDestroy()
        }
}