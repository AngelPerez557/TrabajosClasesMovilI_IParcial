/*
* AUTOR: Angel Antonio Perez Rodriguez
* Fecha: 18 Febrero 2026*/

package com.angel.exposicion2

fun main(){
    val verificador =  Rango()

    println("\n -- Operador AND")
    println("¿Esta en el rango (10-20)?: "+verificador.estaEnRango(15))

    println("\n -- Operador OR")
    println("¿Esta en el rango (10-20)?: "+verificador.estaEnRango(5))

    println("\n -- Operador NOT")
    println("¿Esta en el rango (10-20)?: "+verificador.estaEnRango(25))

}

class Rango{
    fun estaEnRango(numero:Int):Boolean{
        return numero in 10..20
    }
    fun estaEnRango2(numero:Int):Boolean{
        return numero in 10..20
    }
    fun estaEnRango3(numero:Int):Boolean{
        return numero in 10..20
    }
}

