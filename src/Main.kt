import kotlin.math.max


fun main(args: Array<String>) {
val car1 = Car()
    car1.name = "Tesla"
    car1.model = "S Plaid"
    car1.Color = "Red"
    car1.doors = 4

    println("Name = ${car1.name}")
    println("model = ${car1.model}")
    println("Color = ${car1.Color}")
    println("doors = ${car1.doors}")

    println("\n")

    car1.move()
    car1.stop()



val car2 = Car()
    car2.name = "Ford"
    car2.model = "Mustang"
    car2.Color = "Blue"
    car2.doors = 2

    println("\n")
    println("Name = ${car2.name}")
    println("model = ${car2.model}")
    println("Color = ${car2.Color}")
    println("doors = ${car2.doors}")

    car2.move()
    car2.stop()

}


class Car (){
    var name = ""
    var model = ""
    var Color = ""
    var doors = 0


    fun move(){
        println("The Car is moving")
    }

    fun stop (){
        println("The Car has stopped")
    }
}