package ejercicio2

fun main(){
    var num:Int?
    var opcion: Int?=0

    while (opcion!=2){
        println("Introduce un numero entre el 1 y el 99")
        num=readLine()?.toIntOrNull()

        when (num){
            in 1..99->println("digitos del numero $num -> ${num.toString().length}")
            else -> println("Fuera de Rango")
        }

        println("Quieres probar con otro numero? 1-Si 2-No")
        opcion=readLine()?.toIntOrNull()
    }
}