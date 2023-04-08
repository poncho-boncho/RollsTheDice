package poncho_boncho.rollsthedice

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }

        val myFirstDice = Dice(6)
        val mySecondDice = Dice(20)
        println("your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")
        println("your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}")

    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}