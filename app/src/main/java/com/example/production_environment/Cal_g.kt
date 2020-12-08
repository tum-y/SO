package com.example.production_environment

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.View
import com.github.mikephil.charting.charts.LineChart
import com.github.mikephil.charting.charts.PieChart
import com.github.mikephil.charting.data.*
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet
import com.github.mikephil.charting.utils.ColorTemplate
import kotlinx.android.synthetic.main.activity_cal_g.*
import java.util.stream.Collectors.toList


class Cal_g : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cal_g)


        var lineChart = findViewById<View>(R.id.line_chart) as LineChart
        val dataSets = ArrayList<LineDataSet>()


        val x = listOf<Float>(10f, 12f, 15f, 25f, 5f)//X軸

        val y1 = x.map { it }//y軸
        val y2 = x.map { it * it }//y軸


        val entryList1 = mutableListOf<Entry>()
        val entryList2 = mutableListOf<Entry>()
        for (i in x.indices) {
            entryList1.add(
                Entry(x[i], y1[i])
            )
            entryList2.add(
                Entry(x[i], y2[i])
            )
        }

        //XLineDataSetのList
        val lineDataSets = mutableListOf<ILineDataSet>()


        //dataset（LineDataSet）にデータを格納
        val lineDataSet1 = LineDataSet(entryList1, "正答率")
        lineDataSet1.color = Color.BLUE//フォーマット
        lineDataSets.add(lineDataSet1)//リストに格納

        val lineDataSet2 = LineDataSet(entryList2, "解いた問題")
        lineDataSet2.color = Color.RED//フォーマット
        lineDataSets.add(lineDataSet2)//リストに格納


        //lineDataにdataset（LineDataSets）を格納
        val lineData = LineData(lineDataSets)

        lineChart = findViewById(R.id.line_chart)

        lineChart.data = lineData
        lineChart.setData(lineData)


//X軸設定
        lineChart.xAxis.apply {
            isEnabled = true
            textColor = Color.BLACK
        }
//ｙ軸の設定
        lineChart.axisLeft.apply {
            isEnabled = true
            textColor = Color.BLACK
        }

        lineChart.axisRight.apply {
            isEnabled = true
            textColor = Color.BLACK
        }

        //lineChart.notifyDataSetChanged()　更新

        lineChart.animateXY(2000, 2000)
        lineChart.invalidate()

        //Linechart終わり

        //円グラフ１目

        var pieChart = findViewById<View>(R.id.en_chart) as PieChart
        pieChart.setUsePercentValues(true)
        pieChart.getDescription().setEnabled(false)
        pieChart.setDrawHoleEnabled(true)
        pieChart.setTransparentCircleRadius(61f)

        val dimension = listOf("正解数", "不正解")//日本語訳
        val values = listOf<Float>(7F, 3F)//数値


        val entryLis_dimensiont = mutableListOf<PieEntry>()
        val entryList_values = mutableListOf<PieEntry>()

        var entryList = mutableListOf<PieEntry>()
        for (i in values.indices) {
            entryList.add(
                PieEntry(values[i], dimension[i])
            )
        }

        val pieDataSet = PieDataSet(entryList,"candle")
        pieDataSet.colors = ColorTemplate.COLORFUL_COLORS.toList()



        val pieData = PieData(pieDataSet)


        //PiechartにPieDataの格納
        pieChart = findViewById(R.id.en_chart)
        pieChart.data = pieData
        pieChart.legend.isEnabled = false

        pieChart.animateXY(2000, 2000)
        pieChart.invalidate()

        //円グラフ終わり１個目
        //円グラフ2目

        var pieChart1 = findViewById<View>(R.id.en_chart1) as PieChart
        val dimension1 = listOf("正解数", "不正解")//日本語訳
        val values1 = listOf<Float>(5F, 5F)//数値


        val entryLis_dimensiont1 = mutableListOf<PieEntry>()
        val entryList_values1 = mutableListOf<PieEntry>()

        var EntryList = mutableListOf<PieEntry>()
        for (i in values1.indices) {
            EntryList.add(
                PieEntry(values1[i], dimension1[i])
            )
        }

        val pieDataSet1 = PieDataSet(EntryList,"candle")
        pieDataSet1.colors = ColorTemplate.COLORFUL_COLORS.toList()



        val pieData1 = PieData(pieDataSet1)


        //PiechartにPieDataの格納
        pieChart1 = findViewById(R.id.en_chart1)
        pieChart1.data = pieData1

        pieChart1.legend.isEnabled = false

        pieChart1.animateXY(2000, 2000)
        pieChart1.invalidate()

        //円グラフ終わり１個目
        //円グラフ2目

        var pieChart2 = findViewById<View>(R.id.en_chart2) as PieChart
        val dimension2 = listOf("正解数", "不正解")//日本語訳
        val values2 = listOf<Float>(2F, 7F)//数値


        val entryLis_dimensiont2 = mutableListOf<PieEntry>()
        val entryList_values2 = mutableListOf<PieEntry>()

        var EntryList2 = mutableListOf<PieEntry>()
        for (i in values2.indices) {
            EntryList2.add(
                PieEntry(values2[i], dimension2[i])
            )
        }

        val pieDataSet2 = PieDataSet(EntryList2,"candle")
        pieDataSet2.colors = ColorTemplate.COLORFUL_COLORS.toList()


        val pieData2 = PieData(pieDataSet2)


        //PiechartにPieDataの格納
        pieChart2 = findViewById(R.id.en_chart2)
        pieChart2.data = pieData2

        pieChart2.legend.isEnabled = false

        pieChart2.animateXY(2000, 2000)
        pieChart2.invalidate()


    }



}



