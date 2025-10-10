package ejercicio9

fun main() {
    val precipitaciones = Array(7) { 0.0 }
    var cont = 0
    var precipitacion: Double?
    do {
        println("Introduce el valor de precipitacion:")
        precipitacion = readLine()?.toDoubleOrNull()

        if (precipitacion != null) {
            precipitaciones[cont] = precipitacion
            cont++
        }

    } while (cont != 7)

    var total = 0.0
    precipitaciones.forEach { precip ->
        println(precip)
        total += precip
    }

    val media: Double = total / precipitaciones.size

    precipitaciones.forEach { precip ->
        when (precip) {
            in (precip - media)..media -> println("Por debajo.")
            else -> println("Por encima.")
        }
    }
}