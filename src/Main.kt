package com.example.main

import java.awt.ComponentOrientation

fun main(args: Array<String>) {
 val view= View()
    val butten= Button("Login" , "center")
    val roundButten= RoundButten("Sing up","CENTER",30 )

    view.draw()
    butten.draw()
    roundButten.draw()
    }
open class View(){

   open fun draw (){
        println("Drawing the View .")


   }
}
open class Button(val text: String , val orientation: String): View (){
    override fun draw() {
        //here is code for creating the butten
        println("Drawing the Button.")
        super.draw()
    }
}

class RoundButten(text: String ,orientation:  String , val corners: Int): Button(text,orientation){

    override fun draw() {
        println("Drawing the round Button.")
        super.draw()
    }
}

