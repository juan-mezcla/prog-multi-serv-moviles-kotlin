package ejercicio6

fun main(){
    var peso: Double?=0.0
    var contP6_5_a_10: Int=0
    var contP10: Int=0
    var contPMenos6_5: Int=0
    var total: Int=0

    do {
        println("Introduce el peso de la pieza:")
        peso=readLine()?.toDoubleOrNull()
        if (peso!=null && peso!=0.0){


            when(peso){
                in 6.5..10.0 ->contP6_5_a_10++
                10.0->contP10++
                in peso..6.4->contPMenos6_5++
                else-> println("peso no valido")
            }
        }

    }while (peso!=0.0)
    total=contP6_5_a_10+contP10+contPMenos6_5

    println("Número de piezas con un peso entre 6.5 y 10 -> $contP6_5_a_10")
    println("Número de piezas con más de 10 -> $contP10")
    println("Número de piezas con menos de 6.5 -> $contPMenos6_5")
    println("Total de piezas: $total")

}