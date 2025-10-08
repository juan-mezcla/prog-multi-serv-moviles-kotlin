package ejercicio3

fun main(){
    var nota: Double?=0.0
    var total: Double=0.0
    var cont: Int=0
    while (cont<10){
        println("Introduce una nota:")
        nota=readLine()?.toDoubleOrNull()

        if(nota!=null){
            total+=nota
            cont++
        }

    }
    when{
        (total/cont) > 7->println("Aprobado con una media de ${total/cont}")
        (total/cont) <7->println("Suspenso con una media de ${total/cont}")
    }

}