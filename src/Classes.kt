class Car (name: String, var model: String, var Color: String, var doors: Int) {

    var name = name.trim()

    fun move() {
        println("The Car $name is moving")
    }

    fun stop() {
        println("The Car $name has stopped")
    }
}