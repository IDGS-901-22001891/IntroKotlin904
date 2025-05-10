package temasKotlin

import kotlin.math.sqrt

// Programa para calcular la formual general, (valor de a,b,c y regresa dos valores)
// Si no se puede realilzar el calculo se arroja un mensaje de indicaciòn

fun main() {
    println("INgresa los valores necesario para calculuar")

    print("Ingresa el valor de 'a': ")
    val a = readln().toDouble()

    print("INgresa el valor de 'b': ")
    val b = readln().toDouble()

    print("INgresa el valor de 'c': ")
    val c = readln().toDouble()

    // Primero calculamos (b2 - 4ac)
    val primeraParte = (b*b) - (4* a *c)

    if (primeraParte < 0) {
        println("NO se puede resolver este problema por que: $primeraParte).")
    } else {
        // AHora calculamos las raíces
        val parteRaiz = sqrt(primeraParte)
        val x1 = (-b + parteRaiz) / (2 * a)
        val x2 = (-b - parteRaiz) / (2 * a)

        println("\nResultado es igual a:")
        println("x₁ = $x1")
        println("x₂ = $x2")
    }
}
