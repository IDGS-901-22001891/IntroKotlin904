package com.example.introkotlin904.Diccionario

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R
import com.example.introkotlin904.Diccionario.BuscarPalabras
import android.content.Intent

class DiccionarioTraductor : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diccionario_traductor)

        // Primeo ranevgo a las pantallas:
        val btnCapturar = findViewById<Button>(R.id.btnCapturarDicc)
        val btnBuscar = findViewById<Button>(R.id.btnGuardarDicc)

        btnCapturar.setOnClickListener {
            // Creamos un intente para poder moverse entr las pantallas:
            val intent = Intent(this, BuscarPalabras::class.java)

            // Iniciamos la nueva pantalla
            startActivity(intent)
        }

        btnBuscar.setOnClickListener {
            // Creamos otro intente para poder ir a otra pantalla:
            val intent = Intent(this, BuscarPalabras::class.java)

            // Ahora iniciamos la nueva pantalla:
            startActivity(intent)
        }

        enableEdgeToEdge()
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}


/*
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnGoToSecond = findViewById<Button>(R.id.btnGoToSecond)

        btnGoToSecond.setOnClickListener {
            // Crear el Intent para cambiar de Activity
            val intent = Intent(this, SecondActivity::class.java)

            // Iniciar la nueva Activity
            startActivity(intent)

            // Opcional: animación al cambiar de pantalla
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }
    }
}
*/