package ejercicio_tareas

class ListaTarea {
     val listaTarea = mutableListOf<Tarea>()
     var cont:Int=0
    init {
        agregarTarea()
    }

    fun agregarTarea(){
        var opcion:Int=0
        var descripcion: String=""
        var prioridad:Int?=0

        do {
            println("Introduce el tipo de la tarea: 1-Evento. 2-Recordatorio.")
            opcion=readln().toInt();

            println("Introduce la descripcion de la tarea:")
            descripcion=readLine().toString();

            println("Introduce la prioridad de la tarea:")
            prioridad=readLine()?.toIntOrNull()
            prioridad=if(prioridad!=null) prioridad else 1

            if (descripcion!=""){
                if (opcion==1) listaTarea.add(Evento(descripcion,prioridad,false)) else  listaTarea.add(Recordatorio(descripcion,prioridad,false))

                println("Tarea añadida!! \n")

                println("Deseas añadir otra tarea? 1-Si. 2-No.")
                opcion= readln().toInt()

            }else {

                println("Campo de descripcion vacio.")
                opcion=1
            }

        }while (opcion!=2)
    }

    fun eliminarTarea(){
        var opcion:Int=0

        do {
            if (listaTarea.size>0){
            println("Elige por id la tarea de la que quieres cambiar el estado:")
            mostrarTareas()
            opcion=readln().toInt()
            opcion=if (opcion<=listaTarea.size-1 && opcion>0) opcion else -1

            if (opcion!=-1){
                var tarea=listaTarea.removeAt(opcion-1)

            }

                println("Deseas eliminar otra tarea? 1-Si. 2-No.")
                opcion= readln().toInt()

                if (opcion!=1) println("Introduce una opcion dentro del rango. Saliendo de agregar tareas.")
                opcion=2
            }else {
                println("No quedan tareas por eliminar. Saliendo de eliminar tareas")
                opcion=2
            }
        }while (opcion!=2)
    }

    fun mostrarTareas(){
        cont=1
        listaTarea.forEach { println("$cont- $it")
            cont++
        }
    }

    fun tareasCompletadas(){
        cont=1
        println("Tareas completadas")
        listaTarea.forEach { tarea ->
            if (tarea.completada) println("$cont- $tarea")
            cont++
        }
    }

    fun cambiarEstadoTarea(){
        var opcion:Int=0

        do {
            if (listaTarea.size>0){
            mostrarTareas()
            println("Elige por id la tarea de la que quieres cambiar el estado:")
            opcion=readln().toInt()
            opcion=if (opcion<=listaTarea.size-1 && opcion>0) opcion else 1

            listaTarea.get(opcion-1).completada=if (listaTarea.get(opcion-1).completada) false else true
                println("Deseas cambiar otra tarea? 1-Si. 2-No.")
                opcion= readln().toInt()

                if (opcion!=1) println("Introduce una opcion dentro del rango. Saliendo de agregar tareas.")
                opcion=2
            }else {
                println("No quedan tareas por eliminar. Saliendo de eliminar tareas")
                opcion=2
            }

        }while (opcion!=2)
    }

    fun buscarTareas(){
        var opcion:Int=0

        do {
            var descripcion: String=""
            var prioridad: Int?=0
            var encontrado: Boolean=true
            println("Elige el tipo de busqueda: 1-Por descripcion.  2-Por prioridad.")
            opcion=readln().toInt()

            when(opcion){
                1->{
                    println("Introduce la descripcion que tiene que tener la tarea")
                    descripcion=readLine().toString()
                }
                2->{
                    println("Introduce la descripcion que tiene que tener la tarea")
                    prioridad=readLine()?.toIntOrNull()
                }else -> {
                    println("Fuera de rango.")
                    opcion=-1
                }
            }
            if (opcion!=-1 && descripcion.trim()!=""){

                var resultados=if (opcion==1) listaTarea.filter { it.descripcion==descripcion} else listaTarea.filter { it.prioridad==prioridad}

                if (resultados.size>0){
                    println("Tareas encontradas:\n")
                    resultados.forEach { it }
                }

            }


        }while (opcion!=2)
    }
}