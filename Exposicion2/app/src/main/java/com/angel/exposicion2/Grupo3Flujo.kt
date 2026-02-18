package com.angel.exposicion2

class ControlFlujo {

    fun ejemplo(numero: Int) {
        // RETURN: termina la función si el número es negativo
        if (numero < 0) {
            println("Numero invalido")
            return
        }
        for (i in 1..numero) {
            if (i == 5) {
                println("Se salto el 5")
                continue
            }
            if (i == 8) {
                println("Se detuvo en el 8")
                break
            }
            println("Numero: $i")
        }
        print("Fin del programa")
    }

}
fun main() {
    val control = ControlFlujo()
    print("Ingrese un numero: ")
    val numero = readLine()!!.toInt()
    control.ejemplo(numero)
}
