import javax.naming.Name
import kotlin.math.max


fun main(args: Array<String>) {
    val user = User("Alex", "Dobinca", 23)
    val friend = User("joHn", "Smith", 30)

     println("Name: ${friend.name}")

}


class User(name: String, var lastname: String, var age: Int) {
    var name: String


    init {
        if (name.lowercase().startsWith("a")) {
            this.name = name
        } else {
            this.name = "User"
            println("The name dousnt start with the letter 'a' or 'A' ")

        }
    }
    init {

    }
}
