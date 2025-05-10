package temasKotlin


fun saludo(){
    println("HOla MUndo")
}

fun suma(a:Int, b:Int){
    println("La suma de $a + $b es ${a+b}")
}

fun resta(a:Int, b:Int): Int {
    return a-b
}



fun main(){
    saludo()
    suma(4,3)
    println("La resta de 2-3 es ${resta(2,3)}")
}