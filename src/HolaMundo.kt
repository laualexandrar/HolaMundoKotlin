import model.Camera
import model.Movie
import model.Shoe
import java.lang.NullPointerException
import kotlin.math.sqrt

const val  N = "NAME" //tiempo de compilacion
var n = 3 //mala practica de programacion


fun main(args: Array<String>) {
//    println("Hola Mundo")
//    println(1+1)
//    println(3-1)
//    println(2*2)
//    println(4/2)
//    println(7%2)

    val a = 4
    val b = 2

    println(a.plus(b))
    println(a.minus(b))
    println( a.times(b))
    println( a.div(b))

//    var a = -2
//    var b = a.unaryMinus()
//    println("b: $b")

    n = 4
    println(n)

    val name = args[0] //tiempo de ejecución
    println(name)

    println(N)

    val nombre = "Laura"
    val apellido: String = "Lopez"

    println("mi nombre es $nombre $apellido")

    //raw String
    val parrafo = """
        ** hjkl;lkjhhjkl;lkjl;
        ** fghjkhgfghkjljhgj
        ** ghjkjhghfgjkljhjghj
        ** cghjkljhghjkjhghjk
    """.trimIndent() //.trimIndent()respeta los saltos de linea

    println(parrafo.trimMargin("** ")) //.trimMargin("** ") me sirve para cortar lo que no necesito

    //Puedes usar los siguientes para escapar caracteres especiales: \t, \b, \n, \r, \', \", \\ y \$

    val u = 5
    val t: String = u.toString()

    val o = 678
    val p : Int = o.toInt()

    val oneToFive = 1..5
    for(i in oneToFive){
        println(i)
    }

    //val aToC = 'A'..'C'
    for (letra in 'A'..'C' ){ //for (letra in aToC ){
        println(letra)
    }

    val numero = 2
    if (numero.equals(2)){
            println("Si son iguales")
        } else {
        println("No, no son iguales")
    }

    when (numero){
        in 1..5 -> println("Si, esta entre 1 y 5")
        in 1..3 -> println("Si, esta enter 1 y 3")
        !in 1..10 -> println("No, no esta entre 1 y 10")
        else -> println("No esta en alguno de los anteriores")
    }

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..5) {
            if (j.equals(3)) break
            println("j: $j")
        }
    }

    for (i in 1..3) {
        println("\ni: $i ")
        for (j in 1..3) {
            println("\nj: $j")
            for (k in 1..5) {
                if (k.equals(3)) break
                println("k: $k")
            }
        }
    }


/*
    try{
        var compute: String?
        compute = null
        var longitud: Int = compute!!.length
    }catch (e: NullPointerException){
        println("No aceptamos valores nulos")

    }
 */

    //llamada segura
     var compute: String? = null
    var longitud: Int? = compute?.length // va a devolver un valor nulo, lo que va a forzar que longitud tambien tenga un valor nulo (null)
    println("Longitud: $longitud")

    //Operador Elvis
    var teclado: String? = null
    val longitudTeclado: Int = teclado?.length ?: 0 // devuelve cero y se lo asigno a ese dato
    println("Longitud: $longitudTeclado")

    val listWithNulls: List<Int?> = listOf<Int?>(7,null,null,4)
    println("lista con Null: ${listWithNulls}")

    val listWithoutNulls: List<Int?> = listWithNulls.filterNotNull()
    println(listWithoutNulls)

    //array
    val countries = arrayOf("india", "Mexico", "Colombia", "Chile") // es una array generico
    val days = arrayOf("Lunes", "Martes", "Miercoles", "Jueves") //Por lo general las val estan en pluran para arays
    val numbers = intArrayOf(1,2,3,4)

    // println(days) con esto no imprimo la lista, no me sirve, me implime es una direccion de donde se encuentra mi objeto para iterar hago lo siguiente:

    for (num in numbers){
        println("Numbers: $num") // num toma el valor uno a uno de cada uno de los numeros
    }

    //programa el promedio de los numeros

    val numbers2 = intArrayOf(6,6,23,9,2,3,2)
    var sum = 0
    for (num in numbers){
        sum += num
    }

    val average  = sum / numbers2.size

    println("Promedio: $average")

    // mas ejercicios

    var arrayObject = arrayOf(1,2,3) // aqui mi array esta compuesto de objetos
    var intPrimitive : IntArray = arrayObject.toIntArray() // aqui los objetos pasan a ser elementos primitivos y pierdo la ventaja de usar muchos metodos

    val suma = arrayObject.sum()
    println("La suma del array es $suma") //  con este metodo simplifico mas cuando es un objeto y sumo todos los datos de mi array
    arrayObject = arrayObject.plus(4) // aqui quiero agregar el 4 a mi array
    for (a in arrayObject){
        println("Array: $a")
    }

    arrayObject = arrayObject.reversedArray() // quiero imprimir mi array al reves (invertir el arreglo)
    for (a in arrayObject){
        println("Array reversa: $a") /// debemos imprimir el iterador en este caso a
    }

    arrayObject.reverse()
    for(a in arrayObject){
        println("Array reversa: $a")
    }

    //video 22 EXXPRESIONES

    var x = 5
    println("X es igual a 5? ${x==5}") // esta expresion es un valor booleano lo que me devuelve true or false..... lo que debe dar es true

    var mensaje = "El valor de x es $x"
    x++
    println("${mensaje.replace("es", "fue")}, x es igual a: $x") //aqui remplazo la palabra es por fue con .replace

    // video 23 funciones
    println("Raiz cuadrada de: ${sqrt(4.0)}")

    val numbers3 = intArrayOf(6,6,23,9,2,3,2)
    println("El promedio de los numeros es: ${averageNumbers(numbers3,2)}") // aqui en el main estoy llamando mi funcion llamada averageNumbers
    println("${evaluate('+', 2)}")
}

fun evaluate(character: Char = '=', number: Int = 2): String { // (character: Char = '=', number: Int = 2): estos son los datos por defecto que siempre tendra la funcion
    return "${number} es ${character}"
}

fun averageNumbers(numbers3: IntArray, n: Int):Int {
    //promedio de numeros
    var sum = 0
    for (num in numbers3){
        sum += num
    }

    return (sum / numbers3.size)+n

    //video 25 Lambdas

    val saludo  = {println("Hola Mundo")} // saludo es el nombre de la funcion lambda
    saludo()//ejecuto la funcion

    //var suma ={instrucciones -> sentenccias}
    val plus = {a: Int, b: Int, c: Int -> a+b+c}
    val result = plus(3,4,5)
    println(result)
    // otra forma para imprimir el dato println(plus(1,2,3))
    //otra forma println({a: Int, b: Int, c: Int -> a +b + c }(7,8,9))

    val calculateNumber = {n: Int ->

        when (n){
            in 1..3 -> println("Tu numero esta entre uno y tres")
            in 4..7 -> println("tu numero esta entre 4 y 7")
            in 8..10 -> println("tu numero esta entre 8 y 10")
        }
    }

    println(calculateNumber(6))

    val camera = Camera()
    camera.turnOn()
    camera.turnOff()
    println(camera.getCameraStatus())

    camera.setResolution(1080)
    println("resolution: ${camera.getResolution()}")

    var shoe = Shoe("Shoe","Blue Shoes", 1234,"praga")
    println("Shoe: ${shoe}")


   /* shoe.size = 34
    println(shoe.size)

    shoe.model = "Tenis"
    println(shoe.model)
    println(shoe.mark) */

    val movie = Movie("Coco", "Pixar", 120)
    println(movie.title)
    println(movie.creator)
    println(movie.duration)
    println("${movie.duration} min.")


    camera.setMode("automatico")
    println("mode: ${camera.getMode()}")
    camera.setModel("Sony890")
    println("mode: ${camera.getModel()}")

   
}

