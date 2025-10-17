package ejercicio_tareas

data class Evento(override var descripcion: String, override var prioridad: Int?, override var completada: Boolean, val tipo:String="Evento"):
            Tarea(descripcion, prioridad, completada)
