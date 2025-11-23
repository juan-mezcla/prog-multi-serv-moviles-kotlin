package ejercicioRepaso

data class Coche(override var id: Int,
                 override var matricula: String,
                 override var velocidad: Int,
                 var puertas: Int):
            Vehiculo(id,matricula,velocidad)
