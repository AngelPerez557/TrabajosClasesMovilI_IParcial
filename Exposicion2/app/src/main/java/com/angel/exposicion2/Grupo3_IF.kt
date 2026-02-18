package com.angel.exposicion2

fun main() {
    val evaluador = Evaluador()
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    val resultado = evaluador.evaluarNumero(numero)
    println(resultado)
}
class Evaluador {
    fun evaluarNumero(numero: Int): String {
        if (numero >= 0) {
            return "El numero es positivo"
        }
        return "El numero es negativo"
    }
}
