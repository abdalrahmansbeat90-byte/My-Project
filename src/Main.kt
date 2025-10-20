fun main(args: Array<String>) {


val direction = Direction.valueOf("east".uppercase())

    when (direction) {
        Direction.EAST ->{
            println("The Direction EAST")
        }
        Direction.WEST -> println("The Direction WEST")
        Direction.NORTH -> println("The Direction NORTH")
        Direction.SOUTH-> println("The Direction SOUTH")
    }
}

enum class Direction(var direction: String , var distance: Int) {
NORTH("north", 10),
SOUTH("south", 20),
EAST("east", 15),
WEST("west", 40);



    fun printData(){

        println("Direction = $direction and Distance = $distance")

    }


}