val suma: (Int, Int) -> Int = {x,y -> x+y}
val minCuatro: (String) -> Boolean = {it.length > 4}


data class Auto (val color:String, val llantas:Int, val puertas:Int)

fun main() {
    val miAuto:Auto? = Auto("Rojo", 4,4)



    val  resultado = suma(4,5)
    println(resultado)

    val  resultadoMinCuatro = minCuatro("Johnny")
    println(resultadoMinCuatro)

    miAuto?.let{
        it.puertas
        with(it){
            llantas
            color
        }
    }

    miAuto?.apply {

    }

    with(miAuto){

    }


}