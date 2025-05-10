package temasKotlin

// Calculadora en terminal con un while y funciones

fun main() {

    fun sumar(a:Int, b:Int){
        println("La suma de $a + $b es ${a+b}")
    }
    fun restar(a:Int, b:Int){
        print("La resta de $a - $b es ${a+b}")
    }
    fun multipl(a:Int, b:Int) {
        println("La multiplicaciòn de $a * $b, es de ${a*b}")
    }
    fun divisor(a:Int, b:Int) {
        println("La diviciòn de de los mumeros: $a / $b es de ${a/b}")
    }


    var calculadora:Int = 8
    println("----- Selecciona una opcion a relaizar ------- ")
    println("----- Opc 1: Sumar dos nùmeros ------- ")
    println("----- Opc 2: Restar dos nùmeros ------- ")
    println("----- Opc 3: MUltiplicar dos nùmeros ------- ")
    println("----- Opc 4: Dividir dos nùmeros ------- ")
    println("----- Opc 5: Salir ------- ")

    calculadora = readlnOrNull()?.toIntOrNull() ?: 0

    do {
        if (calculadora == 0) {
            println("Nos vemos!")
            break
        }
        if (calculadora == 1) {
            println("Dame el primer nùmero:")
            val a = readlnOrNull()?.toIntOrNull() ?: 0

            println("Dame el segundo nùmero:")
            val b = readlnOrNull()?.toIntOrNull() ?: 0

            sumar(a, b)
            break
        }

        if (calculadora == 2) {
            print("Dame el primer nùmero:")
            val a = readlnOrNull()?.toIntOrNull() ?: 0
            print("Dame el segundo nùmero:")
            val b = readlnOrNull()?.toIntOrNull() ?: 0
            restar(a, b)
            break
        }

        if (calculadora == 3) {
            println("Dame el primer nùmero:")
            val a = readlnOrNull()?.toIntOrNull() ?: 0

            println("Dame el segundo nùmero:")
            val b = readlnOrNull()?.toIntOrNull() ?: 0

            multipl(a, b)
            break
        }

        if (calculadora == 4) {
            println("Dame le primer nùmero: ")
            val a = readlnOrNull()?.toIntOrNull() ?:0

            println("Dame el segundo nùmero: ")
            val b = readlnOrNull()?.toIntOrNull() ?:0

            divisor(a,b)
            break
        }
    } while (calculadora != 0)




}


