import kotlin.math.max


fun main(args: Array<String>) {

    val car1 = Car("Tesla","S Plaid","Red",4)

    println("Name = ${car1.name}")
    println("model = ${car1.model}")
    println("Color = ${car1.Color}")
    println("doors = ${car1.doors}")
    println("\n")

    car1.move()
    car1.stop()

    val car2 = Car("Ford","Mustang","Blue",2)

    println("\n")

    println("Name  = ${car2.name} ")
    println("model = ${car2.model}")
    println("Color = ${car2.Color}")
    println("doors = ${car2.doors}")

    println("\n")

    car2.move()
    car2.stop()


}
class Car (name: String, var model: String, var Color: String, var doors: Int) {

    var name = name.trim()

    fun move() {
        println("The Car $name is moving")
    }

    fun stop() {
        println("The Car $name has stopped")
    }
}