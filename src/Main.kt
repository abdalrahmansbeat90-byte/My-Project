fun main(args: Array<String>) {
    val  s = 75
    val g = if ((s>=90)){
        "A"
    }else if  (s >=75){
        "B"
    }
    else if (s >= 60) {
        "C"
    }
    else {
        "F"
    }
    println("Score = ${s.toString()}")




}


