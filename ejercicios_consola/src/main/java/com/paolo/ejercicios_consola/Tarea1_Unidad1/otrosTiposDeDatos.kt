package com.paolo.ejercicios_consola.Tarea1_Unidad1

fun main() {
    val trip1 = 3.20
    val trip2 = 4.10
    val trip3 = 1.72
    val totalTripLength = trip1 + trip2 + trip3 //sumamos las distancias de las 3 rutas
    println("$totalTripLength miles left to destination")

    val nextMeeting = "Next meeting:"
    val date = "January 1"
    val reminder = nextMeeting + date
    //val reminder = nextMeeting + date + " at work"
    println(reminder)

    //println("Say \"hello\"")

    var notificationsEnabled: Boolean = true
    println(notificationsEnabled)
    notificationsEnabled = false
    println(notificationsEnabled)

    println("Are notifications enabled? " + notificationsEnabled)

    /*
    Este es el ultimo mensaje con respecto al final
    de la primera ruta de aprendizaje
     */
}