package tema1

import androidx.activity.enableEdgeToEdge
import android.os.Bundle
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R


class Ejemplo1Activyty : AppCompatActivity() {
    // Calculadora echa con radio buttons

    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1: TextView
    private lateinit var radioGroup: RadioGroup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ejemplo1_activyty)

        et1 = findViewById<EditText>(R.id.et1)
        et2 = findViewById<EditText>(R.id.et2)
        tv1 = findViewById<TextView>(R.id.tv1)
        radioGroup = findViewById(R.id.radioGroupOperaciones)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun sumar(view: android.view.View){
        val valor1 = et1.text.toString()
        val valor2 = et2.text.toString()
        var resultado: Double = 0.0

        // COloc un switch que en kottlin no se llaman así:
        when (radioGroup.checkedRadioButtonId) {
            R.id.radioSuma -> resultado = valor1.toDouble() + valor2.toDouble()
            R.id.radioResta -> resultado = valor1.toDouble() - valor2.toDouble()
            R.id.radioMult -> resultado = valor1.toDouble() * valor2.toDouble()
            R.id.radioDivision -> resultado = valor1.toDouble() / valor2.toDouble()
        }



        // val resultado = valor1.toDouble() + valor2.toDouble()
        tv1.text = resultado.toString()

    }
}