package com.example.myfirstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToScreenIMC2Screens(view: View) {
        val intent = Intent(this, IMCActivity2Screens::class.java)
        //SAIDA
        startActivity(intent)
    }

    fun goToScreenIMC(view: View) {
        val intent = Intent(this, IMCActivity::class.java)
        //SAIDA
        startActivity(intent)
    }

    fun goToDiametro(view: View) {
        val intent = Intent(this, DIAMETROActivity::class.java)
        startActivity(intent)
    }

    fun goToMes(view: View){
        val intent = Intent(this, MESActivity::class.java)
        startActivity(intent)
    }

    fun goToDistancia(view: View) {
        val intent = Intent(this, KILOActivity::class.java)
        startActivity(intent)
    }
}