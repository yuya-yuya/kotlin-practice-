package com.example.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var a = Random.nextInt(3)

        if (a == 0) {
            textView.text = "ルフィ"
            imageView.setImageResource(R.drawable.luffy)
        } else if (a == 1){
            textView.text = "ゾロ"
            imageView.setImageResource(R.drawable.zoro)
        }else{
            textView.text = "ナミ"
            imageView.setImageResource(R.drawable.nami)
        }
    }

    fun tapButton(view: View) {

        var name = editText.text.toString()

        if(name == "luffy"){
            textView.text = "ルフィ"
            imageView.setImageResource(R.drawable.luffy)
        }else if(name == "zoro"){
            textView.text = "ゾロ"
            imageView.setImageResource(R.drawable.zoro)
        }else if(name == "nami"){
            textView.text = "ナミ"
            imageView.setImageResource(R.drawable.nami)
        }else{
            textView.text = "そんなキャラはいません"
        }

    }
}