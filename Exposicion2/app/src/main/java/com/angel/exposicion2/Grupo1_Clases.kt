/*
* AUTOR: Angel Antonio Perez Rodriguez*/
package com.angel.exposicion2

class Persona(val nombre:String, val edad: Int){
    val mensaje : String = "Mi nombre es: " + nombre + " "+ edad
}

fun main(){
    val persona = Persona(nombre = "Angel", edad = 20)
    println(persona.mensaje)
}