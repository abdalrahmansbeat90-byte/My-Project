fun main(args: Array<String>) {
sendMassage(

    name = "Alexa")

}


fun sendMassage(name: String = " User ", message: String = sendText()) {
println( "name = $name ,and  message = $message" )


}

fun sendText(): String{
    return "Some text!"
}