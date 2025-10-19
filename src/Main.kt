fun main(args: Array<String>) {
    val user = User("Alex", "Dobbin", 23)
user.favoriteMove="Interstallar"

println(user.favoriteMove)

}
class User(var firstName: String, var lastname: String, var age: Int) {
 lateinit var favoriteMove: String

}
