package com.example.production_environment


import android.app.AlertDialog
import android.app.Dialog
import android.os.Bundle
import androidx.fragment.app.DialogFragment


class S_Dialog : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val builder1 = AlertDialog.Builder(activity)
        builder1.setTitle("アーカイブ")
            .setMessage("保存記録のこと。複数形のアーカイブズは、文書保管を目的とした仕組みや、保管をする施設を指す")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder1.create()
    }
}

class S2 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder2 = AlertDialog.Builder(activity)
        builder2.setTitle("アウトソーシング")
            .setMessage("自社の業務の一部又は業務のすべてを外部へ委託すること。専門的な知識・技能が必要となる業務を、その業務を得意とする業者へ外注することで人材育成や設備投資のコストが低減されるメリットがある。\n" +
                    "語源は「Out（外部） + Sourcing（資源利用）」。")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder2.create()
    }}

    class S3 : DialogFragment() {
        override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

            val builder3 = AlertDialog.Builder(activity)
            builder3.setTitle("アカウンタビリティ")
                .setMessage("アカウンティング（会計）とレスポンシビリティ（責任）の合成語")
                .setPositiveButton("お気に入り登録") { dialog, id ->


                }
            return builder3.create()
        }
    }

class S4 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder4 = AlertDialog.Builder(activity)
        builder4.setTitle("アクティビティ図")
            .setMessage("UMLの1つで、上流行程のビジネスプロセスの流れや下流行程のプログラムの制御フローを表すことができる図。")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder4.create()
    }
}

class S5 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder5 = AlertDialog.Builder(activity)
        builder5.setTitle("アジャイル")
            .setMessage("ソフトウェアを迅速かつ適応的にソフトウェア開発を行う軽量な開発手法の総称。 開発プロジェクトを短期間に区切り、その期間内に「要件定義」～「テスト」「運用」までの開発工程を一通り行い、一部分の機能を完成させるという作業を繰り返すことで段階的にシステムを開発していくモデル。")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder5.create()
    }
}

class S6 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder6 = AlertDialog.Builder(activity)
        builder6.setTitle("アフィリエイト")
            .setMessage("企業の広告を個人(企業)の所有するホームページに掲載し、そのリンクをたどって企業の商品やサービスが売れた場合に、広告を載せているホームページの主に報酬を支払うという仕組み。")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder6.create()
    }
}
class S7 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder7 = AlertDialog.Builder(activity)
        builder7.setTitle("ACID")
            .setMessage("Atomicity：原子性\n" +
                    "トランザクション内の処理がすべて実行されるか、または全く実行されないことを保証する性質。\n" +
                    "Consistency：一貫性\n" +
                    "トランザクションによりデータの矛盾が生じないこと。常にデータベースの整合性が保たれていることを保証する性質。\n" +
                    "Isolation：独立性\n" +
                    "複数のトランザクションを同時に実行した場合と、順番に実行した場合の結果が等しくなることを保証する性質。一般にロックなどをかけることで直列可能性を保証する。\n" +
                    "隔離性と呼ばれる場合もある。\n" +
                    "Durability：永続性\n" +
                    "一旦正常終了したトランザクションの結果は、以後システムに障害が発生しても失われないことを保証する性質。\n" +
                    "耐久性と呼ばれる場合もある。")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder7.create()
    }
}

class S8 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder8 = AlertDialog.Builder(activity)
        builder8.setTitle("ANSI")
            .setMessage("アメリカ合衆国の工業的な分野の標準化組織であり公の合意形成のために、さまざまな規格開発をおこなう団体。")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder8.create()
    }
}

class S9 : DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {

        val builder9 = AlertDialog.Builder(activity)
        builder9.setTitle("ARP")
         //   .setMessage("")
            .setMessage("IPアドレスから対応する機器のMACアドレスを取得するプロトコル")
            .setPositiveButton("お気に入り登録") { dialog, id ->


            }
        return builder9.create()
    }
}