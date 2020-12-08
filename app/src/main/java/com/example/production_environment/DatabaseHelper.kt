package com.example.production_environment

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(context: Context): SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {
    //クラス内のpirvate定数を宣言するためにcompanion objectブロックとする。
    companion object {
        /**
         * データベースファイル名の定数フィールド。
         */
        private const val DATABASE_NAME = "androidapp.db"
        /**
         * バージョン情報の定数フィールド。
         */
        private const val DATABASE_VERSION = 1
    }

    override fun onCreate(db: SQLiteDatabase) {
        //テーブル作成用SQL文字列の作成。
        val sb = StringBuilder()
        sb.append("CREATE TABLE client_information (")
        sb.append("_id INTEGER PRIMARY KEY,") //ユーザ識別
        sb.append("username TEXT,") //ゲーム内ユーザーネーム
        sb.append("android_id TEXT") //ユーザーデバイスID
        sb.append(");")
        val sql1 = sb.toString()

        //SQLの実行。
        db.execSQL(sql1)

        val issue = StringBuilder()
        issue.append("CREATE TABLE issue_list (")
        issue.append("issue_id INTEGER PRIMARY KEY,")
        issue.append("choice_section TEXT,") //区分(FEorSG)
        issue.append("question_year TEXT,") //出題年
        issue.append("category TEXT,") //カテゴリー(テクノロジorマネジメントorストラテジ)
        issue.append("sentence TEXT,") //問題文
        issue.append("answer TEXT,") //答え
        issue.append("answer_choice1 TEXT,") //ほかの選択肢１
        issue.append("answer_choice2 TEXT,") //ほかの選択肢２
        issue.append("answer_choice3 TEXT,") //ほかの選択肢３
        issue.append("description TEXT") //問題の解説
        issue.append(");")
        val sql2 = issue.toString()
        db.execSQL(sql2)
    }

    override fun onUpgrade(db: SQLiteDatabase, oldVersion: Int, newVersion: Int) {}
}