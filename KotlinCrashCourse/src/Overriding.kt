// Use open to make parent class extensible by child class
open class ABC2 {
    // Use open in front of a function of a parent class to be overridden by same function in the child class
    open fun display() {
        println("Hello from Parent class")
    }
}

class XYZ2 : ABC2() {
    //Override helps to implement own codes different from that contained in same function in parent class
    override fun display() {
        //Use super to call the overridden function of the parent class if you care to use the code
        //Displays the content of the overridden display function from the parent class
        super.display()
        println("Hello from Child class")

    }
}

fun main() {
    //Parent class
    val abc2 = ABC2()
    abc2.display()

    // Child class
    println("=============Child==========================")
    val xyz2 = XYZ2()
    xyz2.display()
}