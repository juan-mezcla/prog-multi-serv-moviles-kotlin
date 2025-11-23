package ejercicioRepaso

class Vehiculos {
    var listaVehiculos=mutableListOf<Vehiculo>()
    var cont=1
    init {
        agregarVehiculo()
    }

    fun agregarVehiculo(){
        var opcion=0

        do {
            println("Elige el tipo de Vehiculo que quieres añadir: 1-Coche 2-Camion 3-salir")
            opcion=readln().toInt()
            var matricula=""
            var velocidad= (50..120).random()
            if (opcion!=3){

                println("Introduce la matricula del vehiculo:")
                matricula=readln()
                velocidad= (50..120).random()
            }
            when(opcion){
                1->{
                    println("Cuantas puertas tiene el coche?")
                    var puertas=readln().toInt()

                    listaVehiculos.add(Coche(cont,matricula,velocidad,puertas))
                    cont++
                }
                2->{
                    listaVehiculos.add(Camion(cont,matricula,velocidad,null))
                    cont++
                }
                3->println("saliendo de agregar vehiculo")
            }

        }while (opcion!=3)


    }

    fun anadirRemolque(){
        listaVehiculos.filter { it is Camion  && it.remolque==null }.forEach { println(it) }
        println("A que camion quieres añadirle remolque:")
        var opcion=readln().toInt()

        println("Introduce el peso del remolque:")
        var peso=readln().toInt()

        println("Introduce el precio del remolque:")
        var precio=readln().toDouble()

        var camion=listaVehiculos.getOrNull(opcion-1) as Camion

        if(camion==null) println("No se ha encontrado un camion con ese id")
        else camion.ponerRemolque(Remolque(peso,precio))
    }

    fun quitarRemolque(){
        listaVehiculos.filter { it is Camion && it.remolque!=null  }.forEach { println(it) }
        println("A que camion quieres quitarle remolque:")
        var opcion=readln().toInt()

        var camion=listaVehiculos.getOrNull(opcion-1) as Camion

        if(camion==null) println("No se ha encontrado un camion con ese id")
        else camion.quitarRemolque()

    }

    fun mostrarVehiculos(){
        listaVehiculos.forEach { println(it) }
    }

    fun acelerarVehiculos(){
        println("Cuanto van a acelerar los vehiculos:")
        var aceleracion=readln().toInt()

        listaVehiculos.forEach {
            if(it is Camion && it.remolque!=null && it.velocidad+aceleracion>100) println("El camion con matricula ${it.matricula} no puede acelerar mas")
            else it.acelerar(aceleracion)
        }
    }


}