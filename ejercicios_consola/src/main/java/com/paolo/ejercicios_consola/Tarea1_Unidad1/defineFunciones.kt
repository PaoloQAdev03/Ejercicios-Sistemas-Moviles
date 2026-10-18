package com.paolo.ejercicios_consola.Tarea1_Unidad1

fun main() {

    println(birthdayGreeting(name= "Rover", age= 5))
    println(birthdayGreeting(name= "Rex", age= 2))
}

fun birthdayGreeting(name: String, age: Int = 0): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}
