package com.example.introkotlin904

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.Tema4.Ejemplo4
import tema1.Ejemplo1Activyty

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)

        //
        val btn1Ejemplo1 = findViewById<Button>(R.id.btn1)
        val btn2Ejemplo2 = findViewById<Button>(R.id.btn2)
        val btn3Tarea = findViewById<Button>(R.id.btn2)


        btn1Ejemplo1.setOnClickListener {
            navegateToEjemplo1()
        }

        btn2Ejemplo2.setOnClickListener {
            navegateToEjemplo2()
        }

        btn3Tarea.setOnClickListener {
            navegateToTarea1()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navegateToEjemplo1() {
        val intent = Intent(this, Ejemplo1Activyty::class.java)
        startActivity(intent)
    }

    private fun navegateToEjemplo2() {
        val intent = Intent(this, Ejemplo4::class.java)
        startActivity(intent)
    }



}