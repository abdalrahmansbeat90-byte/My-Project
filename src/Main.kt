fun main(args: Array<String>) {

    val numbersStrings = listOf("one", "two", "three", "four")
    println(numbersStrings)
    println(numbersStrings.joinToString())
    val listString = StringBuffer("the list of numbers : ")
   listString.append("!   ").append("I love You     ")
    println(numbersStrings.joinTo(listString))


    println(numbersStrings.joinToString(" | ", prefix = "start : ", postfix = " * end"))

    val numbers = (1..100).toList()
    println(numbers.joinToString(limit = 11, truncated = "<...>"))

    println(numbersStrings.joinToString{"ELEMENT: ${it.uppercase()}"})



}
