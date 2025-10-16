package ejercicio_tareas

fun main() {
    val tareas = ListaTarea()
    menu(tareas)
}

fun menu(tareas: ListaTarea) {
    var opcion: Int?

    do {
        println("""
            Elige una opción:
            1-Agregar tarea
            2-Modificar tarea
            3-Eliminar tarea
            4-Mostrar tareas
            5-Mostrar tareas completadas
            6-Buscar tarea
            7-Salir
        """.trimIndent())

        opcion = readLine()?.toIntOrNull()


        when (opcion) {
            1 -> tareas.agregarTarea()
            2 -> tareas.cambiarEstadoTarea()
            3 -> tareas.eliminarTarea()
            4 -> tareas.mostrarTareas()
            5 -> tareas.tareasCompletadas()
            6 -> tareas.buscarTareas()
            7 -> println("Hasta luego 👋")
            else -> println("Opción inválida.")
        }
    } while (opcion != 7)
}