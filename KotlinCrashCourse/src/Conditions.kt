fun main() {
    usingIfElse()
    usingWhen()
}

fun usingIfElse() {
    println("==========If/Else Demo============")
    println("Enter your first number: ")
    //Receives a number using readLine() and Not Null (!!) operator and converts same to Int
    val myNum: Int = readLine()!!.toInt()
    if (myNum >= 5) {
        println("You passed!")
    }else{
        println("You failed!")
    }
}

fun usingWhen(){
    println()
    println("==============When Demo================")
    println("Enter your score: ")
    //Receives a number using readLine() and Not Null (!!) operator and converts same to Int and assign to myScore
    //val myScore: Int = readLine()!!.toInt()
    //In Kotlin we have 'when' not 'switch' in other languages
    when(readLine()!!.toInt()){
        1 -> println("You got A.")
        2 -> println("You got B.")
        in 3..5 -> println("You got C.")
        else -> println("You failed, try again!")
    }
}
