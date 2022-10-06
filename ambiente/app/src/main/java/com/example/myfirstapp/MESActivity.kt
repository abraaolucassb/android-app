package com.example.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MESActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mes)
    }

    fun calcularMES(view: View) {
        //ENTRADA
        val editTextMes = findViewById<EditText>(R.id.etMes)

        val mes = editTextMes.text.toString().toInt()

        //PROCESSAMENTO
        val result = when (mes) {
            1 -> "O mês é Janeiro."
            2 -> "O mês é Fevereiro."
            3 -> "O mês é Março."
            4 -> "O mês é Abril."
            5 -> "O mês é Maio."
            6 -> "O mês é Junho."
            7 -> "O mês é Julho."
            8 -> "O mês é Agosto."
            9 -> "O mês é Setembro."
            10 -> "O mês é Outubro."
            11 -> "O mês é Novembro."
            12 -> "O mês é Dezembro."
            else -> "Mês inválido."
        }
        //SAIDA
        findViewById<TextView>(R.id.tvMessage).apply {
            //text = message
            text = result
        }
    }
}