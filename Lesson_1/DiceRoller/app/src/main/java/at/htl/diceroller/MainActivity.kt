package at.htl.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val roll_button: Button = findViewById(R.id.roll_button)
        roll_button.text = "Let's Roll"
        roll_button.setOnClickListener{
            Toast.makeText(this,"button clicked",Toast.LENGTH_SHORT)
        }
    }
}
