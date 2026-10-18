package com.paolo.ejercicios_consola.Tarea1_Unidad1

fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)

    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
}

// Define add() function below this line
fun add(firstNumber: Int, secondNumber: Int): Int{
    val result = firstNumber + secondNumber
    return result
}