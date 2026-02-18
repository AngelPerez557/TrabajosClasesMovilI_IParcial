/*
* AUTOR: Angel Antonio Perez Rodriguez
* Fecha: 18 Febrero 2026*/
package com.angel.exposicion2

fun main(){
    val cont = Contador()
    println("Valor Inicial: "+cont.numero)
    cont.incrementar()
    println("Valor Final: "+cont.numero)
}
class Contador()
{
    var numero = 8
    fun incrementar(){
        numero++
    }
}

