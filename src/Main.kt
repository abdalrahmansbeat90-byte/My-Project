fun main(args: Array<String>) {
    val user = User("Alex")
    val friend = User(firstName = "John", lastname = "Smith")
val user2 = User(age = 19, firstName = "Ioana", lastname = "Dobbbi")


    println("Name = ${user.firstName}")
    println("Last Name = ${user.lastname}")
    println("age = ${user.age}")

    println("\n")

    println("Name = ${friend.firstName}")
    println("Last Name = ${friend.lastname}")
    println("age = ${friend.age}")

}

class User(var firstName: String, var lastname: String="lastName", var age: Int=0) {


}
