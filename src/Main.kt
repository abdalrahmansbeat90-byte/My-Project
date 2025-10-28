import javax.xml.crypto.KeySelector
import kotlin.coroutines.CoroutineContext

fun main(args: Array<String>) {

    val numbers = listOf("one", "two", "three", "four")

    println(numbers.associateWith { it.length })

    println(numbers.associateBy { it.first().uppercase() })

    println(numbers.associateBy(keySelector = { it.first().uppercase() }, valueTransform = { it.length }))
}


