//Kotlin program entry point
fun main() {
    //Function calls
    fixedArray()
    gettingArrayElementFromConsole()
    dynamicArray()
    printKeyValueArray()
}

fun fixedArray() {
    println("==================Fixed number of elements in Array==================")
    val myBloodGroup: Array<String> = arrayOf("A", "B", "O", "AB")
    //Using for loop to print the elements of the array
    for(bloodGroup: String in myBloodGroup){
        println("Your Blood Group is $bloodGroup.")
    }
}

fun gettingArrayElementFromConsole(){
    println("=================Receives array element from console and prints same=====================")
    println("Enter your Blood Group (Hint: A or B or O or AB): ")
    val myBloodGroup: Array<String> = arrayOf(readLine()!!.toString())
    for (bloodGroup: String in myBloodGroup){
        println("Your Blood Group is ${bloodGroup.toUpperCase()}.")
    }
}

fun dynamicArray(){
    println("Dynamic array elements Demo")
    val myBloodGroup: ArrayList<String> = ArrayList()
    myBloodGroup.add("A")
    myBloodGroup.add("B")
    myBloodGroup.add("O")
    myBloodGroup.add("AB")
    for (bloodGroup: String in myBloodGroup){
        println("My Blood Group is $bloodGroup")
    }
}

fun printKeyValueArray(){
    println("=================HashMap has Key as employee name and Value as employee salary pair============")
    val myEmp: HashMap<String, Int> = HashMap()
    myEmp["Maduabughichi"] = 900000000
    myEmp["Judith"] = 900000000
    myEmp["Ethan"] = 900000000
    myEmp["Brian"] = 900000000
    for (employee: MutableMap.MutableEntry<String, Int> in myEmp) {
        println("Employee name and salary: $employee.")
    }
    println("==================OR=============================")
    for (employee: String in myEmp.keys){
        println("Employee name: ${employee.toUpperCase()} and employee salary: ${myEmp[employee]}.")
    }
}