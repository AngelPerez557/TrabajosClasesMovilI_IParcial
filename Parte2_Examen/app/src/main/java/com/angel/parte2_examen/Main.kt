package com.angel.parte2_examen
import android.R
import kotlinx.coroutines.processNextEventInCurrentThread
import java.math.BigInteger
import kotlin.math.sqrt

fun main() {
    val numero1: Double
    val numero2: Double
    val numero3: Double

    println("Ingrese Numero a")
    numero1=readln().toDouble()
    println("Ingrese Numero b")
    numero2=readln().toDouble()
    println("Ingrese Numero c")
    numero3=readln().toDouble()


    val x1: Double
    val x2: Double
    val delta: Double

    delta = ((numero2*numero2)-(4*numero1*numero3))

    x1 = (-numero2+sqrt(delta))/(2*numero1)
    x2= (-numero2-sqrt(delta))/(numero1*2)

    if (delta < 0){
        println("No tiene Soluciones")
    }
    else if (delta > 0) {
        println("Dos Soluciones reales")
        println("Primer Valor:" + x1)
        println("Segundo Valor:" + x2)
    }
    else if(delta == 0.0){
        println("Una Solucion Real")
        println("Primer Valor: "+x1)
        println("Segundo Valor: "+x2)
    }


}


