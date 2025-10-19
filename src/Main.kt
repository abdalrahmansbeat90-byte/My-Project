fun main(args: Array<String>) {
    val user = User("Alex")
    val friend = User(firstName = "John", lastname = "Smith")
val user2 = User(age = 19, firstName = "Ioana", lastname = "Dobbbi")

user.firstName = "vlad"


    println(user.firstName)
    println(user.lastname)
    println(user.age)

    println("\n")

    println(friend.firstName)
    println(friend.lastname)
    println(friend.age)

}

class User(firstName: String, var lastname: String="lastName", var age: Int=0) {
    var firstName = firstName
        get() {
            return "FirstName: $field"
        }
        set(value) {
            println("$value was assigned to firstName property")
            field = value
        }
//
//    fun setFirstName(newValue: String) {
//        this.firstName = newValue
//    }
//fun getFirstName(): String {
//    return this.firstName
//}
}
