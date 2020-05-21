//Class declaration
class Summation {
    // Function overloading same function name and unequal number of parameters
    fun sum(num1: Int, num2: Int){
        // You can use '+' or plus
        val add: Int = num1.plus(num2)
        println("=============The first overloaded===============")
        println("The sum is $add.")
    }

    // Function overloading same function name and unequal number of parameters
    fun sum(num1: Int, num2: Int, num3:Int){
        // You can use '+' or plus
        val add: Int = num1.plus(num2).plus(num3)
        println("=============The second overloaded===============")
        print("The sum is $add.")
    }
}

fun main() {
    // Object instantiation or creation
    val sum = Summation()
    //Calls the 1st overloaded function of same name
    sum.sum(20, 30)
    //Calls the 2nd overloaded function of same name
    sum.sum(20, 30, 50)
}