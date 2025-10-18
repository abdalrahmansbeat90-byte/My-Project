import kotlin.math.max


fun main(args: Array<String>) {
val max : Int = findMinandMax(arrayOf(20,40,50,60,10521232),true)
val min : Int = findMinandMax(arrayOf(22,40,50,60,100),false)

    println("The Max value is: $max")
    println("The Min value is: $min")
}

fun findMinandMax(numbers: Array<Int>, searchMax: Boolean): Int {
    var max: Int = numbers[0]
    var min: Int = max
    if (searchMax) {
        for (number in numbers) {
            if (number > max) {
                max = number
            }
        }
        return max

    } else {
        for (number in numbers) {
            if (number < min) {
                min = number
            }
        }

    return min

    }

}