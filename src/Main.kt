fun main(args: Array<String>) {

    val numbers = setOf(1,2,3,4,5)
    println(numbers.map { if (it == 3) it * 100 else it * 10  })
    println(numbers.mapIndexedNotNull { index, value -> if (index == 0) null else index * value })


    val numbersMap = mapOf("Key 1" to 1, "Key 2" to 2, "Key 3" to 3, "Key 4" to 4)
    println(numbersMap.mapKeys { it.key.uppercase() })
    println(numbersMap.mapValues { it.value + it.key.length })


    val colors = listOf("red","brown","grey")
    val animals = listOf("fox","bear","wolf")
    println(colors zip animals)

    println(colors.zip(animals){ color, animal -> "The ${animal.replaceFirstChar { it.uppercase() }} is $color" })



val numberPairs = listOf("one" to 1,"two" to 2,"three" to 3,"four" to 4)

    println(numberPairs)
    println(numberPairs.unzip())

    }

