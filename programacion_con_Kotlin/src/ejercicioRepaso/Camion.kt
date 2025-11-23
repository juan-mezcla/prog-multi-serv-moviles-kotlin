package ejercicioRepaso

data class Camion(override var id: Int,
                  override var matricula: String,
                  override var velocidad: Int,
                  var remolque: Remolque?):
            Vehiculo(id,matricula,velocidad){
    fun ponerRemolque(remolque: Remolque){
        this.remolque= remolque
    }

    fun quitarRemolque(){
        this.remolque=null
    }
}
