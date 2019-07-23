package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val drawableResource = when (Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1

            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4

            else -> R.drawable.dice_6
        }
        val diceImage: ImageView = findViewById(R.id.dice_image)

    }
}
