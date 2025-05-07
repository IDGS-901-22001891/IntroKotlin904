package temasKotlin

class TemasVariabelsK {
    fun main() {
        // Para definir variables, se realiza lo siguiente:
        // Variables mutables 'var'
        val a = 4
        val c = 10
        val b = 8

        println(a)
        println("El valor de b es $b")
        println("El valor de c es: ${c + 2}")

        // c+=5
        // c-=7
        // c*=4
        // c/=2

        var num1: Int = 23
        var num2: Int = 12

        num2 = 6

        var nombre: String = "Isaac"
        var caracter: Char = 'a'

        var num4: Float = 12.3f
        var num5: Double = 12.3

        val readOnlyFigures = listOf("cuadrado", "triangulo", "circulo")
        println(readOnlyFigures)

        val figura: MutableList<String> = mutableListOf("cuadrado", "triangulo", "circulo")
        val readOnlyFigures2 = listOf("cuadrado", "triangulo", "circulo")
        val mutableFiguras: List<String> = figura

        val frutas = setOf("manzana", "banana", "naranja")
        val frutas2 = mutableSetOf("manzana", "banana", "naranja")

        val coches = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
        println(coches)
        val coches2 = mapOf("uno" to 1, "dos" to 2, "tres" to 3)
        println(coches2)

        println("Hola Mundo!")


        
        val readOnlyFiguras = listOf("cuadrado", "triangulo", "circulo")
        println(readOnlyFiguras)
        println("La primera figura es ${readOnlyFiguras[0]}")
        println("EL primer elemento es ${readOnlyFiguras.first()}")
        println("NUmero de elmentos ${readOnlyFiguras.count()} itemes")
        println("Circulo" in readOnlyFiguras)
        println(readOnlyFiguras)
        //ReadOnlyFiguras.add("pentagono)
        var figura: MutableList<String> = mutableListOf("eventos", "trinagulo2", "circulo2")
        println(figura)
        figura.add("pentagono2")
        println(figura)
        figura.add("cuadrado2")
        println(figura)
    }
}
