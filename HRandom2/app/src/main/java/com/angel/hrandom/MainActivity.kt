package com.angel.hrandom

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvChallenge = findViewById<TextView>(R.id.tvChallenge)
        val tvStatus = findViewById<TextView>(R.id.tvStatus)
        val tvStreak = findViewById<TextView>(R.id.tvStreak)
        val btnNew = findViewById<Button>(R.id.btnNew)
        val btnDone = findViewById<Button>(R.id.btnDone)

        val retos = listOf(
            "Tómate un vaso de agua 💧",
            "Camina 10 minutos 🚶‍♂️",
            "Haz 20 sentadillas 🦵",
            "Respira profundo por 1 minuto 🧘",
            "Ordena tu escritorio o mesa 🧹",
            "Escríbele a alguien que no hablas hace días 📩",
            "Estira el cuello y hombros 2 minutos 🙆‍♂️",
            "Apaga el cel 10 minutos y descansa la vista 👀",
            "Limpia tu galería: borra 10 fotos 🗑️",
            "Lee 2 páginas de algo que te guste 📖",
            "Sal a tomar aire 5 minutos 🌤️",
            "Toma un vaso de agua extra 💧",
            "Haz 15 lagartijas (o las que puedas) 💪",
            "Organiza una carpeta del cel o la compu 🗂️",
            "Escribe 1 meta para hoy ✍️",
            "Escucha una canción completa sin distracciones 🎧",
            "Envía un audio motivando a alguien 🎙️",
            "Arregla tu cama 🛏️",
            "Lava un vaso o plato que esté ahí estorbando 🍽️",
            "Da una caminata corta después de comer 🚶",
            "Acomoda tus cables (aunque sea uno) 🔌",
            "Haz 30 segundos de plancha ⏱️",
            "Respira 5 veces lento y profundo 🌬️",
            "Revisa tu postura ahora mismo 🪑",
            "Anota 1 cosa por la que estés agradecido 🙏",
            "Limpia tu escritorio digital (1 archivo) 🧼",
            "Toma una pausa de pantallas 5 minutos 📴",
            "Saluda a alguien con buena vibra 👋",
            "Planea tu próxima tarea importante 🗒️",
            "Prepárate un snack sencillo y sano 🍎"
        )

        val prefs = getSharedPreferences("hrandom_prefs", MODE_PRIVATE)

        val hoy = SimpleDateFormat("yyyy-MM-dd", Locale.getDefault()).format(Date())
        val ultimoDia = prefs.getString("ultimo_dia", null)
        val retoHoy = prefs.getString("reto_hoy", null)
        val completadoHoy = prefs.getBoolean("completado_hoy", false)
        var streak = prefs.getInt("streak", 0)

        // Estado inicial
        tvStreak.text = "🔥 Racha: $streak días"

        if (ultimoDia == hoy && retoHoy != null) {
            tvChallenge.text = retoHoy
            btnNew.isEnabled = false
            tvStatus.text = if (completadoHoy) "✅ Reto completado hoy" else "🔒 Reto del día activo"
            btnDone.isEnabled = !completadoHoy
        } else {
            tvStatus.text = "🎲 Genera tu reto del día"
            btnNew.isEnabled = true
            btnDone.isEnabled = false
        }

        btnNew.setOnClickListener {
            val reto = retos.random()
            tvChallenge.text = reto

            prefs.edit()
                .putString("ultimo_dia", hoy)
                .putString("reto_hoy", reto)
                .putBoolean("completado_hoy", false)
                .apply()

            btnNew.isEnabled = false
            btnDone.isEnabled = true
            tvStatus.text = "🔒 Reto del día activo"
        }

        btnDone.setOnClickListener {
            val reto = tvChallenge.text.toString()

            // Guardar historial
            val historial = prefs.getStringSet("historial", mutableSetOf())!!.toMutableSet()
            historial.add("$hoy — $reto")

            streak += 1

            prefs.edit()
                .putBoolean("completado_hoy", true)
                .putInt("streak", streak)
                .putStringSet("historial", historial)
                .apply()

            tvStreak.text = "🔥 Racha: $streak días"
            tvStatus.text = "✅ Reto completado hoy"
            btnDone.isEnabled = false

            Toast.makeText(this, "¡Buen trabajo! 🔥", Toast.LENGTH_SHORT).show()
        }


    }
}
