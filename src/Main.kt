fun main(args: Array<String>) {
    val max = getMax(5.5, 9.7)
    println(max)
}

fun getMax(a: Int, b: Int): Int {

    return if (a > b){
        return a
    }
    else {
        return b

    }
}

    fun getMax(a: Double, b: Double): Double {
        if (a > b) {
            return a
        } else {
            return b
        }
    }

