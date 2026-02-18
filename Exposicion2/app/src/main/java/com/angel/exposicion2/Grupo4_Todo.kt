/**
 * Archivo: Exposicion.kt
 * Descripción: Este archivo contiene ejemplos para la exposición del grupo 4
 * Autor: Angel, Derick Jhair y Jorge
 * Fecha: 15 de febrero de 2026
 */

package com.angel.exposicion2

// del lateinit
lateinit var nombre: String

// del byLazy
val mensaje: String by lazy {
    println("Espere un momento...")
    "Hola, Lucas!"
}

class manejodeDatos {

    fun filtrarEdades(edades: List<Int>): List<Int> {
        return edades.filter { it > 30 }
    }

    fun cantidadEdades(edades: List<Int>): Int {
        return edades.count { it > 30 }
    }

    fun ordenarNombres(nombres: List<String>): List<String> {
        return nombres.sorted()
    }

    fun ordenarEdadesDescendente(edades: List<Int>): List<Int> {
        return edades.sortedDescending()
    }

}

fun main() {

    val manejador = manejodeDatos()

    /*   // ---------ORDENAMIENTO DE LISTAS---------//
       val edades = listOf(25, 30, 28, 22, 35, 40, 18, 32)
       val nombres = listOf("Ana", "Luis", "Carlos", "Maria", "Jorge")

       println("Edades mayores a 30: " + manejador.filtrarEdades(edades))
       println("Cantidad de edades mayores a 30: " + manejador.cantidadEdades(edades))

       println("\nNombres ordenados: " + manejador.ordenarNombres(nombres))
       println("Edades ordenadas de manera descendente: " + manejador.ordenarEdadesDescendente(edades))

   */
    /*
        //------------------LISTAS MUTABLES----------//
        val frutas = mutableListOf("Manzana", "Banana", "Naranja", "Pera", "Uva")

        print("\nLista inicial de frutas: " + frutas)

        frutas.add("Kiwi")
        frutas.remove("Banana")
        frutas[0] = "Mango"
        frutas.add("Fresa")

        println("\nLista modificada de frutas: " + frutas)

    */
    //------------------MAPS O DICCIONARIOS-------------//
    /*
        val edades = mutableMapOf(
            "Ana" to 25,
            "Luis" to 30,
            "Carlos" to 28
        )
        println(edades)
        edades["Ana"] = 21 // Modificamos la edad
        println("Edad Ana nuevo: "+edades["Ana"])
        println("Edad Luis viejo: "+edades["Luis"])

        edades["Jhair"]=28
        println(edades)

        edades.remove("Luis")
        println(edades)

    */
    //--------Transformaciones-------//
//Maps
    /* val numeros = listOf(1,2,3,4)
     val cuadrados = numeros.map{it*3}
     println("NUMEROS: "+numeros)
     println("CUADRADOS: "+cuadrados)*/
//ZIPS
    /*
    val nombres = listOf("Ana", "Luis", "Carlos")
    val edades = listOf(25, 30, 28)
    val nombres_edades = nombres.zip(edades)

    println(nombres)
    println(edades)
    println(nombres_edades)
*/
//FLATTEN

    /*  val listas = listOf(
          listOf(1, 2),
          listOf(3, 4),
          listOf(5)
      )

      val todo_junto = listas.flatten()
      println(listas)
      println(listas[0])
      println(listas[1])
      println(listas[2])
     println(todo_junto)
  */


    /*


        // Ordenamiento por una propiedad (sortedBy)
        data class Usuario(
            val nombre: String,
            val edad: Int
        )

        val usuarios = listOf(
            Usuario("Ana", 25),
            Usuario("Luis", 30),
            Usuario("Carlos", 18)
        )

        val usuariosOrdenados = usuarios.sortedBy { it.nombre }

        println("Usuarios sin ordenar: ")
        for (usuario in usuarios) {
            println(usuario.nombre + ", " + usuario.edad)
        }

        println("\nUsuarios ordenados por edad: ")
        for (usuario in usuariosOrdenados) {
            println(usuario.nombre + ", " + usuario.edad)
        }
    */

    /*
        //Lateinit
        nombre = "Jorge" // Asignamos un valor a la variable nombre
        println("El nombre es: " + nombre)
    */
    /*
        // by lazy
        println("Antes del mensaje")
        println(mensaje)

        println("\nDespues del mensaje")
        println(mensaje)*/
}

