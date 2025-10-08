package ejercicio4

fun main(){
    val min:Int=8
    val max:Int=500

    for (i in min..max step 1){
        if (i%min==0 && i!=max){
            print("$i-")
        }
    }

}