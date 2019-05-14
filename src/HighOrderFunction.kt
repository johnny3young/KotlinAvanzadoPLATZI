fun suma (num:Int, num2: Int, func:()-> Unit){
    func
    println("La suma de $num y $num2 = ${num+num2}")
}

fun String.funcion (func: (String) -> Unit){
    //String.funcion (func: String.() -> Unit)
    //this.func()
    //Desglosar el String
    func(this)
    println(this)
    println(this.length)
}

fun main() {

    "Hola_Mundo".funcion {
        //println(it)
        //println(length)
        println("Contabilizando los caracteres de la palabra:" )
    }

    suma(6,8){
        15+2
        if ("".isBlank()){
            println(true)
        }
    }
    println("Función de orden mayor")
}