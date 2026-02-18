/*
* AUTOR:Angel Antonio Perez Rodriguez
* 18 de Febrero 2026*/
package com.angel.exposicion2

fun main(){
    val juego = NumeroSecreto()
    println("Ingrese su numero: ")
    val num = readln().toInt()
    println("El numero que usted ingreso: "+num)
    println("El numero secreto es: "+juego.numeroSecreto)
}
class NumeroSecreto()
{
    public val numeroSecreto = 4

    fun verificarNumero(numero:Int): Boolean{
        return numero == numeroSecreto
    }

}

