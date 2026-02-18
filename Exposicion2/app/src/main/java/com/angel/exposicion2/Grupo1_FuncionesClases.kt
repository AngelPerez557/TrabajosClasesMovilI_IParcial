/*
* AUTOR:Angel Antonio Perez Rodriguez*/

package com.angel.exposicion2

class Estudiante(val nombre: String, val nota1: Double, val nota2: Double,val nota3: Double) {

    fun CalcularPromedio(): Double{
        return (nota1+nota2+nota3)/3
    }
    fun aprobo():Boolean{
        return CalcularPromedio()>=60
    }
    fun MostrarInformacion(){
        println("Estudiante: $nombre")
        println("Promedio: ${CalcularPromedio()}%")
        println("Aprobo: ${aprobo()}")
    }

}

fun main(){
    println("Ingrese el nombre del estudiante:")
    val nombre = readln()
    println("Ingrese la nota 1:")
    val nota1 = readln().toDouble()
    println("Ingrese la nota 2:")
    val nota2 = readln().toDouble()
    println("Ingrese la nota 3:")
    val nota3 = readln().toDouble()

    val estudiante = Estudiante(nombre,nota1,nota2,nota3)
    estudiante.MostrarInformacion()
}

