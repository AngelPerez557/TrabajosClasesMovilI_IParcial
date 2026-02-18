/*
* AUTOR: Angel Antonio Perez Rodriguez
* Fecha: 18 Febrero 2026*/

package com.angel.exposicion2

fun main(){
    val op = Operaciones()

    println("Suma: ${op.suma(8,8)}")
    println("resta: ${op.resta(8,8)}")
    println("multiplicacion: ${op.multiplicacion(8,8)}")
    println("division: ${op.division(8,8)}")
    println("division2: ${op.division2(8.0,7.0)}")
    println("multiple: ${op.multiple(8,4, 7)}")
    println("multiple2: ${op.multiple2(1,8, 8)}")
}

class Operaciones {

    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    fun resta(a: Int, b: Int): Int {
        return a - b
    }

    fun multiplicacion(a: Int, b: Int): Int {
        return a * b
    }

    fun division(a: Int, b: Int): Int {
        return a / b
    }

    fun division2(a: Double, b: Double): Double {
        return a / b
    }

    fun multiple(a: Int, b: Int, c: Int): Int {
        return a + b * c
    }

    fun multiple2(a: Int, b: Int, c: Int): Int {
        return a - b / c
    }
}

