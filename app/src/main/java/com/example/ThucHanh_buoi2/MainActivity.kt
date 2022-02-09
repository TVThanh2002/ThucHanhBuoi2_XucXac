package com.example.ThucHanh_buoi2

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rollDice()
        btnRoll.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice(){
        val dice = Dice(6)
        val diceRoll = dice.roll()
        when(diceRoll){
            1 -> imageView.setImageResource(R.drawable.dice_1)
            2 -> imageView.setImageResource(R.drawable.dice_2)
            3 -> imageView.setImageResource(R.drawable.dice_3)
            4 -> imageView.setImageResource(R.drawable.dice_4)
            5 -> imageView.setImageResource(R.drawable.dice_5)
            6 -> imageView.setImageResource(R.drawable.dice_6)
        }
    }
}
class Dice(val numSides: Int) {
    fun roll(): Int {
        return (1..numSides).random()
    }
}
