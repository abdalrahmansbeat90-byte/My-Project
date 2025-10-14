import kotlin.math.hypot
fun main() {

val alarm = 7

    when (alarm) {
     in 1..10 -> {
         println("The Time is in the range 1..10")
     }

        12,14,7 -> {
            println("The time is $alarm")
        }

      /*
        7 -> println("The time is $alarm")
        14 -> println("The time is $alarm")
       */

        else  -> {
            println("The time is $alarm")
        }

    }

}