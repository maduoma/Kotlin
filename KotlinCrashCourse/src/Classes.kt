//Class declaration
class Student {
    // Creates and initialises class variables: name and score
    // leaving their variable type as var as the variables will be reassigned later in the code
    var studentName: String = ""
    var studentMathScore: Int = 0

    //Function to show result
    fun showResult(){
        println("My name is $studentName and I scored $studentMathScore% in Maths.")
    }
}

fun main() {
    //Object instantiation/creation from Student class
    val student = Student()
    //Reassignment of variables
    student.studentName = "Madu"
    student.studentMathScore = 100

    //Calls showResult() function on the object of the class to display the result
    student.showResult()
}