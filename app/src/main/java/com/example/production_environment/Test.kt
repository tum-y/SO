package com.example.production_environment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_test.*

class Test : AppCompatActivity() {

    private var _userId = 1
    private val _helper = DatabaseHelper(this@Test)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val pref = getSharedPreferences(packageName + "SelectionMode", MODE_PRIVATE)
        val editor = pref.edit()

        //データベースヘルパーオブジェクトからデータベース接続オブジェクトを取得。
        val db = _helper.writableDatabase

        val sqlInsert = "INSERT INTO issue_list (issue_id, choice_section, question_year, category, sentence, answer, answer_choice1, answer_choice2, answer_choice3, description) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)"
        //SQL文字列を元にプリペアドステートメントを取得。
        val sqlDelete = "DELETE FROM issue_list"
        //SQL文字列を元にプリペアドステートメントを取得。1-3
        var stmt = db.compileStatement(sqlDelete)
        stmt.executeUpdateDelete()

        //入力したユーザー名を確認デバック
//            test.setText(inputUsername)
        //test_FEへ画面移行
        FE_btn.setOnClickListener {
            stmt = db.compileStatement(sqlInsert)
            //変数のバイド。
//        stmt.bindLong(1, _userId.toLong())
            stmt.bindString(2, "FE")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "BEC(Business E-mail Compromise)に該当するものはどれか。")
            stmt.bindString(6, "巧妙なだましの手口を駆使し，取引先になりすまし")
            stmt.bindString(7, "送信元を攻撃対象の組織のメールアドレスに詐称し，多数の実在しないメールアドレスに" +
                    "一度に大量の電子メールを送り，攻撃対象の組織のメールアドレスを故意にブラックリストに登録させて，利用を阻害する。")
            stmt.bindString(8, "第三者からの電子メールが中継できるように設定された" +
                    "メールサーバを，スパムメールの中継に悪用する。")
            stmt.bindString(9, "誹誘中傷メールの送信元を攻撃対象の組織のメールアドレスに" +
                    "詐称し，組織の社会的な信用を大きく損なわせる。")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

//        stmt = db.compileStatement(sqlInsert)
//        stmt.bindLong(1, _userId.toLong())
            stmt.bindString(2, "FE")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "参加組織及びそのグループ企業において検知されたサイバー攻撃" +
                    "などの情報を，IPAが情報ハブになって集約し，参加組織間で共有する取組はどれか。")
            stmt.bindString(6, "J-CSIP")
            stmt.bindString(7, "CRYPTREC")
            stmt.bindString(8, "CSIRT")
            stmt.bindString(9, "JISEC")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            stmt.bindString(2, "FE")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "JIS Q 27001:2014(情報セキュリティマネジメントシステム－要求" +
                    "事項)において，リスクを受容するプロセスに求められるものはどれか。")
            stmt.bindString(6, "受容するリスクについては，リスク所有者が承認す" +
                    "ること")
            stmt.bindString(7, "受容するリスクを監視やレビューの対象外と" +
                    "すること")
            stmt.bindString(8, "リスクの受容は，リスク分析前に行うこと")
            stmt.bindString(9, "リスクを受容するかどうかは，リスク対応" +
                    "後に決定すること")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            stmt.bindString(2, "FE")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "退職する従業員による不正を防ぐための対策のうち，IPA組織" +
                    "における内部不正防止ガイドライン(第4版)に照らして，適切なものはどれか。")
            stmt.bindString(6, "退職間際に重要情報の不正な持出しが行われやすいので，退職予定者に対する重要情報へのアクセスや媒体の持出しの監視を強化する。")
            stmt.bindString(7, "在職中に知り得た重要情報を退職後に公開しないよ" +
                    "うに，退職予定者に提出させる秘密保持誓約書には，秘密保持の対象を明示せず，重要情報を客観的に特定できないようにしておく。")
            stmt.bindString(8, "退職後，同業他社に転職して重要情報を漏らす" +
                    "ということがないように，職業選択の自由を行使しないことを明記した上で，具体的な範囲を設定しない包括的な競業避止義務契約を入社時に締結する。")
            stmt.bindString(9, "退職者による重要情報の持出しなどの不正" +
                    "行為を調査できるように，従業員に付与した利用者IDや権限は退職後も有効にしておく。")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            editor.putString("SelectionMode", "FE")
            editor.apply()

            val intent = Intent(this, TestPlay::class.java)
            startActivity(intent)
            finish()
        }

        //test_sgへ画面移行
        SG_btn.setOnClickListener {

            stmt = db.compileStatement(sqlInsert)
            //変数のバイド。
//        stmt.bindLong(1, _userId.toLong())
            stmt.bindString(2, "SG")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "")
            stmt.bindString(6, "")
            stmt.bindString(7, "")
            stmt.bindString(8, "")
            stmt.bindString(9, "")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            stmt.bindString(2, "SG")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "")
            stmt.bindString(6, "")
            stmt.bindString(7, "")
            stmt.bindString(8, "")
            stmt.bindString(9, "")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            stmt.bindString(2, "SG")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "")
            stmt.bindString(6, "")
            stmt.bindString(7, "")
            stmt.bindString(8, "")
            stmt.bindString(9, "")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            stmt.bindString(2, "SG")
            stmt.bindString(3, "2020")
            stmt.bindString(4, "マネジメント")
            stmt.bindString(5, "")
            stmt.bindString(6, "")
            stmt.bindString(7, "")
            stmt.bindString(8, "")
            stmt.bindString(9, "")
            stmt.bindString(10, "ネットで調べてください")
            //インサートSQLの実行。
            stmt.executeInsert()

            editor.putString("SelectionMode", "SG")
            editor.apply()

            val intent = Intent(this,TestPlay::class.java)
            startActivity(intent)
            finish()
        }

        //homeへ戻る
        back_btn.setOnClickListener {
            finish()
        }
    }

    override fun onDestroy() {
        //ヘルパーオブジェクトの開放。
        _helper.close()
        super.onDestroy()
    }
}