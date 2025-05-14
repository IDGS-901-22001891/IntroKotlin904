package tema1

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class OPeracionAB : AppCompatActivity() {

    //

    private lateinit var et1: EditText
    private lateinit var et2: EditText
    private lateinit var tv1:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operacion_ab)

        et1 = findViewById<EditText>(R.id.et1)
        et2 = findViewById<EditText>(R.id.et2)
        tv1 = findViewById<TextView>(R.id.tv1)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    //
    fun accion(view: android.view.View) {
        // Transofmro los strings a valores enteros
        val valor1 = et1.text.toString().toInt()
        val valor2 = et2.text.toString().toInt()

        var resultado = ""
        var suma = 0

        //El for que hara todo el trabajo
        for (i in 1..valor2){

            // Vamos agregando el valor a la suma
            resultado += valor1

            if (i < valor2) {
                resultado += "+"
            }

            // Sumamos los valores hata terminar
            suma += valor1
        }

        // Mueostramos los daots en la pantalla
        resultado += "=$suma"
        tv1.text = resultado
    }
}