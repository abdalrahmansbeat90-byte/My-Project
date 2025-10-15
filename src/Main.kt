fun main(args: Array<String>) {
sayHello(name ="Alex", age = 22)
val hasInternetConnection=false
    if (hasInternetConnection==true){

        getData(data ="Some data")
    }
    else{
        showMasseg()

    }
}
fun  sayHello(name: String,age: Int) {
 var number=age

    println("Hello , $name your age is $age")

}

fun getData(data:String){
 println("your data is $data")
  }

fun showMasseg(){
    println("Theres no internet connection")


  }



