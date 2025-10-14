import kotlin.math.hypot
fun main(args: Array<String>) {

val alarm = 7

    val text = when {
        alarm <= 10  -> "The Time is in the range 1..10"
        alarm == 8 || alarm == 7  -> "The time is $alarm"
        else  -> "The time is $alarm"
     }

    println(text)

  }