fun main() {
    val num = 5


    if (num > 10) {
        println("Number is greater than 10")
    } else if (num == 10) {
        println("Number is equal to 10")
    } else {
        println("Number is less than 10")
    }


    val day = 3
    when (day) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        else -> println("Other day")
    }
}

