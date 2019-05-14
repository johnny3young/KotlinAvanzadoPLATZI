sealed class Intencion {
    class Refrescar:Intencion()
    class RecargarMas:Intencion()
}

fun main() {
    val intencion:Intencion = Intencion.Refrescar()

    val output = when (intencion){
        is Intencion.Refrescar -> "Refresh"
        is Intencion.RecargarMas -> "Cargar mas data"
    }

    println(output)
}