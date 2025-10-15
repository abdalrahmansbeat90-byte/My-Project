fun main(args: Array<String>) {
   println(sum(5,6,7,10,5,6,4,5,3,4,5,6,4,4,6,5))

}

fun sum(vararg number: Int): Int {
   var result = 0
    for (numbers in number) {
        result += numbers
    }
    return result
}
