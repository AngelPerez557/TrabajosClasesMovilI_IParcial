package com.angel.exposicion2

fun main() {
    val persona = mayorEdad()
    print("Ingrese su edad: ")
    val edad = readLine()!!.toInt()
    val resultado = persona.verificarEdad(edad)
    println(resultado)
}
class mayorEdad {
    fun verificarEdad(edad: Int): String {
        if (edad >= 18) {
            return "Eres mayor de edad"
        } else {
            return "Eres menor de edad"
        }
    }
}