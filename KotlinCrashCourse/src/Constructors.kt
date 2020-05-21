class  Employee {
    var empName: String = ""
    var empBloodGroup: String = ""

    //Constructor to give initial or default value to the object when called or created
    constructor(){
        empBloodGroup = "O"
    }
}

fun main() {
    //Creates object of type Employee class (Creates object from Employee class)
    val employee = Employee()
    //Reassigns employees's name
    employee.empName = "Madu"
    //No need to reassign employee.empBloodGroup with a new value as its assignment in the constructor() has taken care of it
    println("The employee name is ${employee.empName} with Blood Group as ${employee.empBloodGroup}.")
}