package ug.global.assignment2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val textViewA: TextView = findViewById(R.id.textView2) as TextView
        val textViewB: TextView = findViewById(R.id.textView) as TextView
        val textViewC: TextView = findViewById(R.id.textView3) as TextView
        val textViewD: TextView = findViewById(R.id.textView4) as TextView
        val textViewE: TextView = findViewById(R.id.textView5) as TextView
        val textViewF: TextView = findViewById(R.id.textView6) as TextView
        val textViewG: TextView = findViewById(R.id.textView7) as TextView

        textViewA.setText("Mobile Programming")
        textViewB.setText("Computer Network and Security")
        textViewC.setText("Artificial Intelligence")
        textViewD.setText("Automata,Complexity and Computability")
        textViewE.setText("Data Communication and Networks")
        textViewF.setText("Enterpreneurship")
        textViewG.setText("COURSES STUDIED THIS SEMESTER")
    }
}