package com.doggy.count

import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //変数の定義
    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //TextViewに初期値を表示
        count_text_view.text = "0"

        //plus_buttonの処理
        plus_button.setOnClickListener {
            //1を足す
            number += 1
            //TextViewに反映
            count_text_view.text = number.toString()

            //numberの値によって文字の色を変更
            if(number >= 100){
                count_text_view.setTextColor(Color.RED)
            } else if (number >= 50) {
                count_text_view.setTextColor(Color.GREEN)
            } else if (number < 0) {
                count_text_view.setTextColor(Color.BLUE)
            } else {
                count_text_view.setTextColor(Color.GRAY)
            }
        }

        //minus_buttonの処理
        minus_button.setOnClickListener {
            //1を引く
            number--
            //TextViewに反映
            count_text_view.text = number.toString()

            //numberの値によって文字の色を変更
            if(number >= 100){
                count_text_view.setTextColor(Color.RED)
            } else if (number >= 50) {
                count_text_view.setTextColor(Color.GREEN)
            } else if (number < 0) {
                count_text_view.setTextColor(Color.BLUE)
            } else {
                count_text_view.setTextColor(Color.GRAY)
            }
        }
    }
}
