package ejercicio1

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var vueltas=0
    var nota: Int?
    var media=0

    while (vueltas<4){
        println("Dame una nota:")
        nota= readLine()?.toIntOrNull()!!

        media+=nota
        vueltas++
    }

    when(media/vueltas){
        in 0..4->println("Suspenso con una media de ${media/vueltas}")
        in 5..10->println("Aprobado con una media de ${media/vueltas}")
    }

}