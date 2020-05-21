//Class declaration
class Summation {
    // Function overloading same function name and unequal number of parameters
    fun sum(num1: Int, num2: Int){
        // You can use '+' or plus
        val add: Int = num1.plus(num2)
        println(add)
    }

    // Function overloading same function name and unequal number of parameters
    fun sum(num1: Int, num2: Int, num3:Int){
        // You can use '+' or plus
        val add: Int = num1.plus(num2).plus(num3)
        println(add)
    }
}

fun main() {
    // Object instantiation or creation
    val sum = Summation()
    //Calls the 1st overloaded function
    println("The summation from the first overloaded function is ${sum.sum(20, 30)}.")
    //Calls the 2nd overloaded function
    println("The summation from the first overloaded function is ${sum.sum(20, 30, 50)}.")
}