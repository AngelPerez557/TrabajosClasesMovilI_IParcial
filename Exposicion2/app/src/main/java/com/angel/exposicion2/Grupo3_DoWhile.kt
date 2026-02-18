/*
* AUTOR: Angel Antonio Perez Rodriguez*/
package com.angel.exposicion2

class Menu {

    fun mostrarMenu(){
        var opcion: Int

        do{
            println("---MENU")
            println("1. Saludar")
            println("2. Salir")
            print("Seleccione: ")
            opcion = readln().toInt()

            when(opcion) {
                1 -> println("Hola Mundo")
                2 -> println("Adios")
                else -> println("Opcion Invalida")
            }
            }while(opcion != 2)
    }
}

fun main(){
    val menu = Menu()
    menu.mostrarMenu()
}

