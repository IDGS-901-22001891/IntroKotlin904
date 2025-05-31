package com.example.introkotlin904.Diccionario

import android.os.Bundle
import android.widget.*
import android.content.Intent
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.introkotlin904.R

class BuscarPalabras : AppCompatActivity() {

    private val fileName = "diccionario.txt"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_buscar_palabras)

        val edtPalabra = findViewById<EditText>(R.id.edtPalabraBuscar)
        val rabIngles = findViewById<RadioButton>(R.id.rbIngles)
        val rabEspanol = findViewById<RadioButton>(R.id.rbEspanol)
        val btnBuscar = findViewById<Button>(R.id.btnBuscar)
        val txvResultado = findViewById<TextView>(R.id.txvResultado)
        val btnRegresar = findViewById<Button>(R.id.btnRegresar)

        btnBuscar.setOnClickListener {
            val palabra = edtPalabra.text.toString().trim()
            val buscarEnIngles = rabIngles.isChecked

            if (palabra.isEmpty()) {
                Toast.makeText(this, "Ingresa una palabra", Toast.LENGTH_SHORT).show()
            } else {
                val resultado = buscarPalabra(palabra, buscarEnIngles)
                txvResultado.text = resultado ?: "Palabra no encontrada"
            }
        }

        btnRegresar.setOnClickListener {
            val intent = Intent(this, DiccionarioTraductor::class.java)
            startActivity(intent)
        }

        // Para adaptar los Insets del sistema (barra de estado, navegación, etc.)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun buscarPalabra(palabra: String, buscarEnIngles: Boolean): String? {
        return try {
            openFileInput(fileName).bufferedReader().useLines { lines ->
                lines.mapNotNull { it.split(",").takeIf { it.size == 2 } }
                    .firstOrNull { (ingles, espanol) ->
                        if (buscarEnIngles) ingles.equals(palabra, ignoreCase = true)
                        else espanol.equals(palabra, ignoreCase = true)
                    }?.let { (ingles, espanol) ->
                        if (buscarEnIngles) espanol else ingles
                    }
            }
        } catch (e: Exception) {
            null
        }
    }
}
