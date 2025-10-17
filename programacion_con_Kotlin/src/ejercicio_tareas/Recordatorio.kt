package ejercicio_tareas

data class Recordatorio(override var descripcion: String, override var prioridad: Int?, override var completada: Boolean,val tipo:String="Recordatorio"):
            Tarea(descripcion, prioridad, completada)
