/*
* Grupo 2
* AUTOR:Angel Antonio Perez Rodriguez
* 18 de Febrero 2026*/

package com.angel.exposicion2

fun main()
{
    val comp = Comparaciones()
    println("Ingrese el valor de a:")
    val a = readln().toInt()
    println("Ingrese el valor de b:")
    val b = readln().toInt()

    println("Es igual: ${comp.esIgual(a,b)}")
    println("es Diferente: ${comp.esDiferente(a,b)}")
    println("Es Mayor: ${comp.esMayor(a,b)}")
    println("Es Menor: ${comp.esMenor(a,b)}")
    println("Es Mayor o Igual: ${comp.esMayorOIgual(a,b)}")
    println("Es Menor o Igual: ${comp.esMenorOIgual(a,b)}")

}
class Comparaciones{
    fun esIgual(a:Int,b:Int):Boolean{
        return a==b
    }
    fun esDiferente(a: Int, b: Int): Boolean {
        return a != b
    }
    fun esMayor(a: Int, b: Int): Boolean {
        return a > b
    }
    fun esMenor(a: Int, b: Int): Boolean {
        return a < b
    }
    fun esMayorOIgual(a: Int, b: Int): Boolean {
        return a >= b
    }
    fun esMenorOIgual(a: Int, b: Int): Boolean {
        return a <= b
    }
}

