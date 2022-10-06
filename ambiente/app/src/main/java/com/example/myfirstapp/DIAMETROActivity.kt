package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class DIAMETROActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diametro)
    }

    fun calcularDIAMETRO(view: View) {
        //ENTRADA
        val editTextRaio = findViewById<EditText>(R.id.etRaio)

        val raio = editTextRaio.text.toString().toDouble()
        val pi = 3.14

        //PROCESSAMENTO
        val comprimento = 2.0 * pi * raio
        val diametro = pi / comprimento
        val area = pi * raio * raio

        //SAIDA
        findViewById<TextView>(R.id.tvMessage).apply {
            //text = message
            text = "O comprimento é ${comprimento}, o diâmetro é ${diametro} e o raio é ${raio}."
        }
    }
}