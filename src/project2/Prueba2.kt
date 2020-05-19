package project2

class Prueba2 {

}

fun main(args: Array<String>) {
    println("This is project 1")

    val chonchitos = arrayListOf("Laura","Camilo", "Doraemon", "Pepa", "Pepita", "Kaizer")
    val edadChonchitos = intArrayOf(26,31,1,13,2,49)


//    for (chon in chonchitos){
//        for (edad in edadChonchitos){
//            println("En la familia chon $chon Tiene $edad años")
//        }
//    }

    chonchitos.forEachIndexed { index, chon ->
        println("En la familia chon $chon Tiene ${edadChonchitos[index]} años")
    }
}