fun main() {
    printVariables()
    printParameterizedFunction(10, 10)
    greetings("Welcome to the World of Kotlin.")
    printSumFromInputConsole()
}

fun printVariables() {
    println("==========None-Parameterized Function=============")
    val myNum1 = 2
    val myNum2 = 2
    val sum: Int = myNum1 + myNum2
    println("The sum is $sum.")
}

fun printParameterizedFunction(myNum1: Int, myNum2: Int){
    println("================Parameterized Function=============")
    val sum: Int = myNum1 + myNum2
    println("The sum is $sum.")
}

fun greetings(greet: String){
    println("===================Greetings========================")
    val hello: String = greet
    println(hello)
}

fun printSumFromInputConsole(){
    println("==========Gets Input from Console and printing the sum===================")
    println("Enter your first number: ")
    //Receives the first input number using readLine() and not null (!!) operator and converts the String into Int
    val myNum1: Int = readLine()!!.toInt()
    println("Enter your second number: ")
    //Receives the second input number using readLine() and not null (!!) operator and converts the String into Int
    val myNum2: Int = readLine()!!.toInt()
    // Adds myNum1 and myNum2 and assign it to sum
    val sum: Int = myNum1.plus(myNum2)
    println("The sum is $sum.")
}
