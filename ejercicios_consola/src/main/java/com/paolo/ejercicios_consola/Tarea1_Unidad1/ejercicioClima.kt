package com.paolo.ejercicios_consola.Tarea1_Unidad1

//¿Puedes crear una función que imprima los detalles del clima de una sola ciudad para reducir la
// repetición en la función main() y, luego, hacer lo mismo en las ciudades restantes?

fun main() {
    printWeather(city = "Ankara", lowTemp = 27, highTemp = 31, chanceOfRain = 82)
    printWeather(city = "Tokyo", lowTemp = 32, highTemp = 36, chanceOfRain = 10)
    printWeather(city = "Cape Town", lowTemp = 59, highTemp = 64, chanceOfRain = 2)
    printWeather(city = "Guatemala City", lowTemp = 50, highTemp = 55, chanceOfRain = 7)
}

private fun printWeather(city: String, lowTemp: Int, highTemp: Int, chanceOfRain: Int) {
    println("City: $city")
    println("Low temperature: $lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceOfRain%")
    println()
}