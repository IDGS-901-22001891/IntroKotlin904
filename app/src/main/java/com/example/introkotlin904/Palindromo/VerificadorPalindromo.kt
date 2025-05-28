package com.example.introkotlin904.Palindromo

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class VerificadorPalindromo : AppCompatActivity() {
    // Primero creamos las variabeles del boton y el ingreso de texto
    private lateinit var edt1: EditText
    private lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_verificador_palindromo)
        // Ahora almacenmos el valor que fue ingresado por el usuario
        edt1 = findViewById<EditText>(R.id.edt1)
        tv1 = findViewById<TextView>(R.id.tv1)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
    // Creamos la función para analizar la palabra y saber si es un palindromo
    fun verificar(view: View) {
        // El valor lo hacemos un string
        val input = edt1.text.toString()
        //
        if (input.isEmpty()) {
            tv1.text = "Ingresa una plablara"
            return
        }
        // Eliminamos las comillas y lo hacemos minusculas
        val limpiar = input.lowercase().filter { it.isLetterOrDigit() }
        /// Invertimos el orden de la palabra limpiada
        val alReves = limpiar.reversed()
        // Si amobos son iguales el valor sera verdadero
        val esUnPalindromo = limpiar == alReves
        //
        if (esUnPalindromo) {
            // Seleccioanmos las vocales a mostrar
            val vocales = limpiar.filter {
                it in "aeiou"
            }
            // Ya hora seleccionamos las consonates; SOn la sque no son vocales xd
            val consonantes = limpiar.filter {
                it.isLetter() && it !in "aeiou"
            }
            // * Con esto ahora solo envmsos esta información a la otra pantalla
            val enviar = Intent(this, Resultado::class.java).apply {
                putExtra("Palabra original:", input)
                putExtra("Palavara al reves:", alReves)
                putExtra("Vocales de la palabra:", vocales)
                putExtra("COnsonantes de la plabra", consonantes.length)
            }
            startActivity(enviar)
        } else {
            tv1.text = "No es palí´ndromo"
        }
    }
}