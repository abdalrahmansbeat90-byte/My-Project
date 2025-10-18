import javax.naming.Name
import kotlin.math.max


fun main(args: Array<String>) {
    val user = User("Alex")
    val friend = User("joHn", "Smith")

    println("Name = ${user.name}")
    println("Last Name = ${user.lastname}")
    println("age = ${user.age}")

    println("\n")

    println("Name = ${friend.name}")
    println("Last Name = ${friend.lastname}")
    println("age = ${friend.age}")

}

class User(var name: String, var lastname: String, var age: Int) {


    constructor(name: String) : this(name, "LastName", 0) {
        println("2nd")

    }

    constructor(name: String, lastname: String) : this(name, lastname, 0) {
        println("3nd")


    }

}
