package com.polippo.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.text = "Let's Roll"
        rollButton.setOnClickListener {
            diceRoller()
        }
    }

    private fun diceRoller() {

        val randomInt = java.util.Random().nextInt(6) + 1

        val drawbleResource = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.drawable.empty_dice
        }

        val diceImage: ImageView = findViewById(R.id.dice_image)
        diceImage.setImageResource(drawbleResource)
    }
}