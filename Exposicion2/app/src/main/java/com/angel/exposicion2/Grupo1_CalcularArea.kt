/*
* AUTOR: Angel Antonio Perez Rodriguez*/

package com.angel.exposicion2

class Rectangulo(val base : Double, val altura:Double){

    fun CalcularArea():Double{
        return base + altura
    }
}

fun main(){
    val rect = Rectangulo(base = 10.0, altura = 5.0)
    println("El area del rectangulo es: "+rect.CalcularArea())
}

