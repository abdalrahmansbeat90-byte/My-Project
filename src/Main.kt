fun main(args: Array<String>) {
    val user1 = User("Alex", "Dobbin", 23)
    val user2 = User("john", "Dobbin", 23)

    println(user1.equals(user2))


    println(user1)
    println(user2)


}

data class User(var firstName: String, var lastName: String, var age: Int): Any(){


}

