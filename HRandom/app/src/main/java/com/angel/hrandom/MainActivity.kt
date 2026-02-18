package com.angel.hrandom

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.angel.hrandom.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val retos = listOf(
            "Toma un vaso de agua 💧",
            "Escríbele a alguien que no ves hace días 📩",
            "Camina 5 minutos 🚶",
            "Respira profundo por 1 minuto 🧘",
            "Ordena tu escritorio 🧹"
        )

        binding.btnNew.setOnClickListener {
            val reto = retos.random()
            binding.tvChallenge.text = reto
        }
    }
}
