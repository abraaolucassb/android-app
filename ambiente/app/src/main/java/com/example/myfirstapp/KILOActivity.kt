package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class KILOActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kilo)
    }

    fun calcularKILO(view: View) {
        //ENTRADA
        val editTextOption = findViewById<EditText>(R.id.etOption)
        val editTextDist = findViewById<EditText>(R.id.etDist)

        val option = editTextOption.text.toString().toInt()
        val dist = editTextDist.text.toString().toDouble()

        //PROCESSAMENTO
        val a = dist * 8
        val b = dist * 9
        val c = dist * 12

        val result = when (option){
            1 -> a
            2 -> b
            3 -> c
            else -> "Digite um tipo válido."
        }
        //SAIDA
        findViewById<TextView>(R.id.tvMessage).apply {
            //text = message
            text = "O consumo estimado é ${result} km/litro."
        }
    }
}