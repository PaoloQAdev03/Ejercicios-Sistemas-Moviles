package com.paolo.ejercicios_consola.Tarea1_Unidad1

fun main() {

    println(birthdayGreeting1(age = 5))
    println(birthdayGreeting1(age = 2))

}
fun birthdayGreeting1(name: String = "Rover", age: Int = 0): String {
    val nameGreeting = "Happy Birthday, $name!"
    val ageGreeting = "You are now $age years old!"
    return "$nameGreeting\n$ageGreeting"
}