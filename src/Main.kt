fun main(args: Array<String>) {
    val User1 = User("Name 1")
    val User2 = User("Name 2")
    val User3 = User("Name 3")
    val User4 = User("Name 4")
    val User5 = User("Name 5")
    val User6 = User("Alex")
    val User7 = User("Alex")



    val names = mutableSetOf<String>(User1.name, User2.name, User3.name, User4.name, User5.name, User6.name)




    names.forEach { println(it) }


}

class User (val name:String)
