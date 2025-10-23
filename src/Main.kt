fun main(args: Array<String>) {
println(Car("abod","red",))

}

interface  Engine {
    fun startEngine()


}
class Car (val name: String , val color : String) : Engine {
    override fun startEngine() {
       println("the Car is starting engine .")
    }


}

class Truck (val name: String , val color : String ) : Engine {
    override fun startEngine() {
        println("the Truck is starting engine .")
    }

}

class plane (val name: String , val color: String ) : Engine {
    override fun startEngine() {
        println("the plane is starting engine .")
    }

}

class Tesla (val name: String , color: String ) : Engine {
    override fun startEngine() {
        println("Tesla is starting engine .")
    }

}