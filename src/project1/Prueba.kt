package project1

import java.lang.Math.random

class Prueba {

}

fun main(args: Array<String>) {
    println("This is project 1")

    //programa el promedio de los numeros

    val numbers = intArrayOf(6,6,23,9,2,3,2)
    var sum = 0
    for (num in numbers){
        sum += num
    }

    val average  = sum / numbers.size

    println("Promedio: $average")

    // ejercicio

    val random1 = random()
    val random2 = {random()}

    println(random1)
    println(random2())

}

fun random ():Int {
    return (Math.random() * 100).toInt()
}