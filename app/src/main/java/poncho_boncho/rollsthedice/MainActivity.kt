package poncho_boncho.rollsthedice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myFirstDice = Dice(6)
        val mySecondDice = Dice(20)
        println("your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")
        println("your ${mySecondDice.numSides} sided dice rolled ${mySecondDice.roll()}")

    }
}