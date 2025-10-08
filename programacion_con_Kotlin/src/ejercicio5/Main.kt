package ejercicio5

fun main(){
    var opcion: Int?=0
    do {
        println("Introduce un numero entre 0 y 999:")
        opcion=readLine()?.toIntOrNull()

        if (opcion!=0){
            when(opcion){
                in 0..999-> println("El numero tiene ${opcion.toString().length} digito/s")
                else -> println("Fuera de rango.")
            }
        }

    }while (opcion!=0)

}