import kotlin.math.hypot
fun main() {

val alarm = 7

    val text = when (alarm) {
     in 1..10 -> {
         "The Time is in the range 1..10"
     }

        12,14,7 -> {
          println("some text")
            "The time is $alarm"
        }



        else  -> {
           "The time is $alarm"
        }

    }
println(text)
}