package com.tashi.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var rollButton: Button
    private lateinit var resultImage : ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rollButton = findViewById(R.id.rollButton)
        resultImage  = findViewById(R.id.resultImage);



        rollButton.setOnClickListener {
            rollDice()
        }
    }

    private fun rollDice() {


        var id = when(Random.nextInt(6) +1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6

           else -> R.drawable.empty_dice
       }

        resultImage.setImageResource(id)
    }
}