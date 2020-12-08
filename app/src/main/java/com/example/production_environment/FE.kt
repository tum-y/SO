package com.example.production_environment


import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.CheckBox
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_f_e.*
import java.util.ArrayList
import kotlinx.android.synthetic.main.activity_past_q.*
import kotlinx.android.synthetic.main.activity_past_q.back_btn


class FE : Activity() {
    var fe_pick = arrayOfNulls<CheckBox>(4) //分野選択格納場所
    var fe_age = arrayOfNulls<CheckBox>(10)//
    var fe_season = arrayOfNulls<CheckBox>(2)

    //ジョンに加工するための情報入れるところの箱
    var age = arrayOfNulls<Int>(10) //年代
    var season = arrayOfNulls<String>(2)//季節
    var fild = arrayOfNulls<String>(3)//分野
    //最後にDBを削除する


    //分野　リスト名　fild :: [0]テクノロジー[1]マネジメント[2]ストラテジー
    //val fild : ArrayList<String> = arrayListOf("テクノロジ","マネジメント","ストラテジー")
    //年代　リスト名　age　
    //val age : ArrayList<Int> = arrayListOf(2019,2018,2017,2016,2015)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_f_e)


        //戻るボタン
        back_btn.setOnClickListener {
            val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }

//年代の処理
//チェックボックスの紐付け

        fe_age[0] = findViewById(R.id.fe_2019)
        fe_age[0]?.setChecked(false)
        fe_age[0]?.setOnClickListener({
            val check19 = fe_age[0]!!.isChecked

            //選択分岐　チェック済み処理
            if (check19) {
                age[0] = 2019

            } else {

                //チェックが外されたら
                age[0] = 0
            }
        })


        //チェックボックスの紐付け

        fe_age[1] = findViewById(R.id.fe_2018)
        fe_age[1]?.setChecked(false)
        fe_age[1]?.setOnClickListener({
            val check18 = fe_age[1]!!.isChecked

            //選択分岐　チェック済み処理
            if (check18) {
                age[1] = 2018

            } else {

                //チェックが外されたら
                age[1] = 0
            }
        })


        //チェックボックスの紐付け

        fe_age[2] = findViewById(R.id.fe_2017)
        fe_age[2]?.setChecked(false)
        fe_age[2]?.setOnClickListener({
            val check17 = fe_age[2]!!.isChecked

            //選択分岐　チェック済み処理
            if (check17) {
                age[2] = 2017

            } else {

                //チェックが外されたら
                age[2] = 0
            }
        })



        //チェックボックスの紐付け

        fe_age[3] = findViewById(R.id.fe_2016)
        fe_age[3]?.setChecked(false)
        fe_age[3]?.setOnClickListener({
            val check17 = fe_age[3]!!.isChecked

            //選択分岐　チェック済み処理
            if (check17) {
                age[3] = 2016

            } else {

                //チェックが外されたら
                age[3] = 3
            }
        })



        //チェックボックスの紐付け

        fe_age[4] = findViewById(R.id.fe_2015)
        fe_age[4]?.setChecked(false)
        fe_age[4]?.setOnClickListener({
            val check15 = fe_age[4]!!.isChecked

            //選択分岐　チェック済み処理
            if (check15) {
                age[4] = 2015

            } else {

                //チェックが外されたら
                age[4] = 0
            }
        })



//季節の処理
// チェックボックスの紐付け

        fe_season[0] = findViewById(R.id.spring)
        fe_season[0]?.setChecked(false)
        fe_season[0]?.setOnClickListener({
            val checksp = fe_season[0]!!.isChecked

            //選択分岐　チェック済み処理
            if (checksp) {
                season[0] = "春"

            } else {

                //チェックが外されたら
                season[0] = null
            }
        })



        // チェックボックスの紐付け

        fe_season[1] = findViewById(R.id.autumu)
        fe_season[1]?.setChecked(false)
        fe_season[1]?.setOnClickListener({
            val checkau = fe_season[1]!!.isChecked

            //選択分岐　チェック済み処理
            if (checkau) {
                season[1] = "秋"

            } else {

                //チェックが外されたら
                season[1] = null
            }
        })




//テクノロジ編
//チェックボックスの紐づけ
        fe_pick[0] = findViewById(R.id.tn_id)
        fe_pick[0]?.setChecked(false)

//チェックボックスの中身登録

        fe_pick[0]?.setOnClickListener({

//チェックボックスのステータス取得
            val check0 = fe_pick[0]!!.isChecked

//選択分岐　チェック済み処理
            if (check0) {
                fe_pick[0]?.setText("テクノロジ-選択されました-")

            } else {

                //チェックが外されたら
                fe_pick[0]?.setText("テクノロジ")
            }
        })

//マネジメント編
//チェックボックスの関連紐づけ
        fe_pick[1] = findViewById(R.id.ma_id)
        fe_pick[1]?.setChecked(false)

//チェックボックスの中身登録

        fe_pick[1]?.setOnClickListener({

//チェックボックスのステータス取得
            val check1 = fe_pick[1]!!.isChecked

//選択分岐　チェック済み処理
            if (check1) {
                fe_pick[1]?.setText("マネジメント-選択されました-")
            } else {

                //チェックが外されたら
                fe_pick[1]?.setText("マネジメント")
            }
        })

//ストラテジー編
        //チェックボックスの関連紐づけ
        fe_pick[2] = findViewById(R.id.st_id)
        fe_pick[2]?.setChecked(false)

//チェックボックスの中身登録

        fe_pick[2]?.setOnClickListener({

//チェックボックスのステータス取得
            val check2 = fe_pick[2]!!.isChecked

//選択分岐　チェック済み処理
            if (check2) {
                fe_pick[2]?.setText("ストラテジー-選択されました-")
            } else {
                //チェックが外されたら
                fe_pick[2]?.setText("ストラテジー")
            }
        })

//OKボタン
        ok_btn.setOnClickListener {
           // val intent = Intent(this, HomeScreen::class.java)
            startActivity(intent)
        }
















    }


    }






