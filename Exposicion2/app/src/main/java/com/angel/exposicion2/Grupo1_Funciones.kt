/*
* AUTOR: Angel Antonio Perez Rodriguez*/
package com.angel.exposicion2

fun main()
{
    println("Ingrese el Numero 1:")
    val numero1 : Int = readln().toInt()
    println("Ingrese el Numero 2:")
    val numero2: Int = readln().toInt()

    suma(numero1, numero2)
    println("la resta es: "+resta(numero1,numero2))
    multiplicacion(numero1,numero2)
    division(numero1,numero2)
}

fun suma(valor1: Int,valor2: Int){

    println("La suma es: "+(valor1+valor2))
}
fun resta(valor1: Int, valor2: Int):Int{
    return valor1-valor2
}
fun multiplicacion(valor1: Int,valor2: Int){
    println("La multiplicacion es: "+(valor1*valor2))
}
fun division(valor1: Int,valor2: Int){
    println("La division es: "+(valor1/valor2))
}
