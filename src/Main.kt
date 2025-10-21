import java.awt.Window
import javax.script.ScriptEngine

fun main(args: Array<String>) {


}

class Vehicle(val name: String,val color: String) {

    fun move (){
        println("$name is moving")
    }
    fun stop(){
        println("$name has stopped")
    }
}
class Car (val name : String, val color : String , val engine: Int ,val doors : Int){

    fun move (){
        println("$name is moving")
    }
    fun stop(){
        println("$name has stopped")
    }

}
class plan(val name : String, val color : String, val engine : Int , val doors : Int){
    fun move (){
        println("$name is moving")
    }
    fun stop(){
        println("$name has stopped")
    }
}