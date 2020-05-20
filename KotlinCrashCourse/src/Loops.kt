//Kotlin program entry point
fun main() {
    //Function calls
    whileLoop()
    forLoop()
    forLoopStep()
    forLoopFromHighToLow()
}

fun whileLoop() {
    println("======================While Loop Demo===================================")
    println("Enter your number to test: ")
    //Receives the number in myNum using readLine() and Not Null (!!) operator and converts and assigns same to myNum before testing
    var myNum: Int = readLine()!!.toInt()
    while (myNum <= 5) {
        println("The number $myNum iteration is $myNum.")
        myNum++
    }
}

fun forLoop() {
    //Prints a line of String and moves the cursor to the next line
    println("======================For loop from 1 to 10===================================")
    for (myNum: Int in 1..10){
        println("Iteration $myNum is $myNum")
    }
}

fun forLoopFromHighToLow(){
    println("======================For loop from 10 to 1===================================")
    for (myNum: Int in 10 downTo 1){
        println("$myNum")
    }
}
fun forLoopStep(){
    println("==========For loop from 1 to 10 step 2 ie adding 2 subsequently after the first iteration=========")
    for (myNum: Int in 1..10 step 2){
        println("$myNum")
    }
}