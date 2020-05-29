//Every class is final by default in Kotlin and cannot be inherited by a child class,
// to inherit a parent class by the child class, attach 'open' to the front of the parent class
open class ABC {
    fun printFromParent() {
        println("===========Parent Class==================")
        println("Hello from parent class!")
    }
}

class XYZ : ABC() {
    fun printFromChild() {
        println("================Child Class==================")
        println("Hello from Child class!")
    }
}

fun main() {
    // Instantiated XYZ has access to the functions in parent class and itself
    val xyz = XYZ()
    //Calls function of the parent class
    xyz.printFromParent()
    //Calls its own function of the child class
    xyz.printFromChild()
}