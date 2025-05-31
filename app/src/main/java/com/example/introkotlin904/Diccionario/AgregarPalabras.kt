package com.example.introkotlin904.Diccionario

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R
import android.content.Intent
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class AgregarPalabras : AppCompatActivity() {

    // Primero creamos un archio .txt
    private val fileName = "diccionario.txt"



    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_agregar_palabras)


        // Ahora greamos las variables para poder utilizar la APP:
        val edtPalabraIngles = findViewById<EditText>(R.id.edtIngles)
        val edtPalabraEspano = findViewById<EditText>(R.id.edtEspanol)

        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        // Nos movemos a otras pantallas:
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)


        // Funcion para almacenar los datos
        fun guardarPalabra(palabraIngles: String, palabraEspanol: String) {
            val palabra = "$palabraIngles, $palabraEspanol\n"
            try {
                openFileOutput(fileName, MODE_APPEND).use {
                    it.write(palabra.toByteArray())
                }
                Toast.makeText(this, "Palabras guardadas", Toast.LENGTH_SHORT).show()
            } catch (e: Exception) {
                e.printStackTrace()
                Toast.makeText(this, "Error al guardar", Toast.LENGTH_SHORT).show()
            }
        }


        // Accion para almacenar los datos dentro del .TXT
        btnGuardar.setOnClickListener {
            // Guardamos los datos en el archivo
            val palabraIngles = edtPalabraIngles.text.toString().trim()
            val palabraEspanol = edtPalabraEspano.text.toString().trim()

            // Validamos la entrada de los datos antes de que se guarden
            if (palabraIngles.isEmpty() || palabraEspanol.isEmpty()) {
                Toast.makeText(this, "Ingresar las dos palabras", Toast.LENGTH_SHORT).show()
            } else {
                // Llamamos la ffuncion para guardar los datos
                guardarPalabra(palabraIngles, palabraEspanol)
                edtPalabraIngles.text.clear()
                edtPalabraEspano.text.clear()
            }
        }


        // Accion del boton para regresar a la pantalla anterior
        btnRegresar.setOnClickListener {
            val intent = Intent(this, DiccionarioTraductor::class.java)

            startActivity(intent)
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}