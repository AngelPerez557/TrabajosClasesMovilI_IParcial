package com.angel.exposicion2

class Contador {
    fun contar(numero: Int) {
        for (i in 1..numero) {
            println("Numero: $i")
        }
    }
}

fun main() {
    val contador = Contador()
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    contador.contar(numero)
}