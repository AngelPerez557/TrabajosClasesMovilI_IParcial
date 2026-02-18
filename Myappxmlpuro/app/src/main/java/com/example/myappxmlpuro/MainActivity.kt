package com.example.myappxmlpuro

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.constraint_main)

        val tvChallenge = findViewById<TextView>(R.id.tvChallenge)
        val btnNew = findViewById<Button>(R.id.btnNew)

        val retos = listOf(
            "Toma un vaso de agua 💧",
            "Escríbele a alguien que no ves hace días 📩",
            "Camina 5 minutos 🚶",
            "Respira profundo por 1 minuto 🧘",
            "Ordena tu escritorio 🧹"
        )

        btnNew.setOnClickListener {
            val reto = retos.random()
            tvChallenge.text = reto
        }
    }
}
