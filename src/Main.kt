fun main(args: Array<String>) {
    val user1 = User("Alex", "Dobbin", 23)
    val user2 = User("john", "Dobbin", 23)

println(user1.equals(user2))


    println(user1)
    println(user2)


}

class User(var firstName: String, var lastName: String, var age: Int): Any(){
    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (other is User) {
            return firstName == other.firstName
            && this.lastName == other.lastName
            && this.age == age
        }

        return false
    }
    override fun hashCode(): Int {
        return 0
    }
    override fun toString(): String {
        return "User (  firstName = $firstName,  lastName = $lastName,  age = $age  )"
    }

}