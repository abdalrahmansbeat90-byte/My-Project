import kotlin.math.hypot
fun main() {
  var x = 5
  val y = 3


    println("x + y = ${x+y}")
    println("x - y = ${x-y}")
    println("x * y = ${x*y}")
    println("x / y = ${x/y}")
    println("x % y = ${x%y}")

    var result = x+y

    result += 2
println("result 1 = $result")


    result -= 2
    println("result 2 = $result")


    result *= 2
    println("result 3 = $result")


    result /= 2
    println("result 4 = $result")


    result %= 2
    println("result 5 = $result")


    println("( 3 + 3 ) * 4 = ${( 3 + 3 ) * 4 }")

    x = 0
    println("x = ${x++}")
    println("x + ${ ++x } ")

    println("x = ${x--}")
    println("x = ${--x}")

}