fun main(args: Array<String>) {
println(Direction.WEST)
println(Direction.NORTH)
println(Direction.SOUTH)
println(Direction.EAST)

}

enum class Direction(var direction: String , var distance: Int) {
NORTH("north", 10),
SOUTH("south", 20),
EAST("east", 15),
WEST("west", 40),

}