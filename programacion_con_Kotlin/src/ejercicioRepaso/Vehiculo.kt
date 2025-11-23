package ejercicioRepaso

open class Vehiculo(
    open var id: Int,
    open var matricula: String,
    open var velocidad: Int){
    fun acelerar(cantidad: Int){

        this.velocidad+=cantidad
        println(this)
        println("Este vehiculo ha acelerado $cantidad, total de velocidad $velocidad")
    }
}
