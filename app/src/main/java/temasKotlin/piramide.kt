package temasKotlinwhile

// Pirmaide de asterìscos tal cual lo que te imaginas (Solo con do/while)
fun main() {
    do {
        print("Dame la cantidad de renglonses de piràmide: ")
        var cantidad:Int = readlnOrNull()?.toIntOrNull() ?:0 // Valor del usuario
        var inicioRenglones:Int = 1  // Valor para los renglones
        var inicioAsteriscos:Int = 0  // Para los asteriscos
        // var inicioAsteriscos:Int = 1  // Para los asteriscos


        do {
            do {
                print('*')
                inicioAsteriscos++
            } while (inicioAsteriscos < inicioRenglones)
            print("\n")
            inicioRenglones++
            inicioAsteriscos = 0    // Reseteo el contador
        } while (inicioRenglones <= cantidad)

        /*
        do {
            do {
                print('*')
                inicioAsteriscos++
            } while (inicioAsteriscos<cantidad)
            print("\n")
            // inicio++
            cantidad --
            inicioAsteriscos = 0    // Reseteo el contador
            cantidad-1
        } while (inicioRenglones<cantidad)
        */
    } while (cantidad != 0)
}



/*
val piramide:Int = 5
val valorPiramide: Int

do {
    println("Dame un nùmero para hacer la piràmide")

} while(piramide == 0
        */