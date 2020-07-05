package com.example.calender

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var diceImage: ImageView
    lateinit var rollButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollButton = findViewById(R.id.roll_button)
        diceImage  = findViewById(R.id.dic_image)
        rollButton.setOnClickListener{
            rollfunction()
        }
    }

    private fun rollfunction() {
        val rnds = (1..6).random()
        val drawableresource  = when(rnds){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableresource)
//        val randomInt = Random().nextInt(6) + 1

    }
}