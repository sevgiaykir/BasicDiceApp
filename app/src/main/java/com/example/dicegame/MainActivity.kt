package com.example.dicegame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val sayiText1: TextView=findViewById(R.id.sayiText1)
        val sayiText2: TextView=findViewById(R.id.sayiText2)
        val zarImage1: ImageView=findViewById(R.id.zarImage1)
        val zarImage2: ImageView=findViewById(R.id.zarImage2)
        val sallaButton: Button=findViewById(R.id.sallaButton)
        val temizleButton: Button=findViewById(R.id.temizleButton)

        sallaButton.setOnClickListener{
            val randomSayi1= (1..6).random()
            val randomSayi2= (1..6).random()

            sayiText1.text=randomSayi1.toString()
            sayiText2.text=randomSayi2.toString()

            when(randomSayi1){
                1-> zarImage1.setImageResource(R.drawable.zar1)
                2-> zarImage1.setImageResource(R.drawable.zar2)
                3-> zarImage1.setImageResource(R.drawable.zar3)
                4-> zarImage1.setImageResource(R.drawable.zar4)
                5-> zarImage1.setImageResource(R.drawable.zar4)
                else -> zarImage1.setImageResource(R.drawable.zar6)
            }

            when(randomSayi2){
                1-> zarImage2.setImageResource(R.drawable.zar1)
                2-> zarImage2.setImageResource(R.drawable.zar2)
                3-> zarImage2.setImageResource(R.drawable.zar3)
                4-> zarImage2.setImageResource(R.drawable.zar4)
                5-> zarImage2.setImageResource(R.drawable.zar4)
                else -> zarImage2.setImageResource(R.drawable.zar6)
            }
        }

        temizleButton.setOnClickListener{
            zarImage1.setImageResource(R.drawable.boszar)
            zarImage2.setImageResource(R.drawable.boszar)

            sayiText1.text=" "
            sayiText2.text=" "
        }
    }
}