package com.angel.exposicion2

fun main() {
    val login = Validador()
    login.iniciarSesion()
}

class Validador {
    fun iniciarSesion() {
        val claveCorrecta = "1234"
        var clave = ""

        while (clave != claveCorrecta) {
            print("Ingrese la contrasena: ")
            clave = readLine()!!
            if (clave != claveCorrecta) {
                println("Contrasena incorrecta")
            }
        }

        println("Acceso permitido")
    }
}