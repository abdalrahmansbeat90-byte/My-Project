fun main(args: Array<String>) {
    val numbers = listOf("one", "two", "three", "four")
    val longerThan3 = numbers.filter { it.length > 3 }
    println(longerThan3)

    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 101" to 101)
    val filteredMap = numbersMap.filter { it.key.endsWith("1") && it.value > 100 }

    println(filteredMap)

    val filteredIdx = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    val filteredNot = numbers.filterNot { it.length <= 3 }
    println(filteredIdx)
    println(filteredNot)


    val mixedList = listOf(1, 2, 3, 'A', 'B', 'C', "Hello World", "Alex", false)
    mixedList.filterIsInstance<Boolean>().forEach {
        println(it)
    }
    println("\n")

    val (match, rest) = numbers.partition { it.length > 3 }
    println(match)
    println(rest)
}