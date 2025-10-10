package ejercicio8

fun main(){
 var opcion:Int?=0
 var base:Int?=0
 var altura:Int?=0
 var resultado: Double=0.0
 var cont: Int=0
 do {
     println("Dime la base del triangulo:")
     base=readLine()?.toIntOrNull()

     println("Dime la altura del triangulo:")
     altura=readLine()?.toIntOrNull()
     if (altura!=null && base!=null){
         resultado= ((base*altura)/2).toDouble()
         println("Superficie del triangulo es de $resultado")

         if(resultado>20){
             cont++
         }
     }

     println("Quieres ver la superficie de otro triangulo? 1-Si. 2-No.")
    opcion=readLine()?.toIntOrNull()

     if (opcion==null ||  opcion>3 || opcion<1){
         println("Opcion mal introducida.")
     }

 }while (opcion!=2 || opcion==null)

    println("Triangulos con superficie mayor de 20: $cont")

}