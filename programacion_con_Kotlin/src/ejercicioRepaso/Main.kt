package ejercicioRepaso

fun main(){
    val vehiculos= Vehiculos ()
    menu(vehiculos)
}


fun menu(vehiculos: Vehiculos){


    var opcion=0
    do {
        println("1-Añadir vehiculo. 2-Añadir remolque a vehiculo. 3-Quitar remolque a vehiculo. 4-mostrarVehiculos 5-Acelerar vehiculos")
        println("Elige una opcion:")
        opcion=readln().toInt()

        when(opcion){
            1->vehiculos.agregarVehiculo()
            2->vehiculos.anadirRemolque()
            3->vehiculos.quitarRemolque()
            4->vehiculos.mostrarVehiculos()
            5->vehiculos.acelerarVehiculos()
            6->println("Hasta luego")
        }

    }while (opcion!=6)


}


