package ejercicio7

fun main(){
    val min:Int=1
    val max:Int=100000
    println("Numeros multiplos de 3,4 y 9:")
    for (i in min..max step 1){
        if (i%3==0 && i%4==0 && i%9==0){
            println("$i")
        }
    }

}