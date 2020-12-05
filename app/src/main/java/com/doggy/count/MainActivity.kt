package com.doggy.count

import android.graphics.Color
import android.media.MediaPlayer
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

        //サウンドファイルを読み込んで、プレイヤーを作成
        val plusSound = MediaPlayer.create(this, R.raw.plus_sound)
        val minusSound = MediaPlayer.create(this, R.raw.minus_sound)

        //TextViewに初期値を表示
        count_text_view.text = "0"

        //plus_buttonの処理
        plus_button.setOnClickListener {
            //1を足す
            number += 1
            //TextViewに反映
            count_text_view.text = number.toString()

            //効果音の巻き戻し
            plusSound.seekTo(0)
            //効果音の再生
            plusSound.start()

            //numberの値によって文字の色を変更
            if(number >= 30){
                count_text_view.setTextColor(Color.RED)
            } else if (number >= 10) {
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

            //効果音の巻き戻し
            minusSound.seekTo(0)
            //効果音の再生
            minusSound.start()

            //numberの値によって文字の色を変更
            if(number >= 30){
                count_text_view.setTextColor(Color.RED)
            } else if (number >= 10) {
                count_text_view.setTextColor(Color.GREEN)
            } else if (number < 0) {
                count_text_view.setTextColor(Color.BLUE)
            } else {
                count_text_view.setTextColor(Color.GRAY)
            }
        }
    }
}
