package temasKotlin

class tema3-if-when {
    val d: Int
    val check = true

    if (check) {
        d = 1
    } else {
        d = 2
    }

    println(d)

    val d2 = if (check) 1 else 2
    println(d2)
    println("--------------------------------------------------------------------")
}