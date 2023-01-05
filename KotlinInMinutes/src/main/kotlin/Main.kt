import java.util.*

fun main(args: Array<String>) {
    //println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")


    // var: read and write (mutable) type variable
    // val: read-only type variable
    // var name: type = value
    // val name: type = value
    // var name = value, there's no need to specify the type if you are initializing the variable with a value. It will be inferred automatically.
    val firstName: String = "Madu"
    // Use var if the variable is going to be changed later after it is initialized.
    val weight = 100
    println(weight)

    val instagramHandle: String? = null
    if (instagramHandle != null)
        println(instagramHandle)
    println(instagramHandle?.uppercase())

    val names = mutableListOf<String>("Madu", "Abu", "Ghichi")
    names.add("Emeka") // Error: Unresolved reference: add
    for (name in names) {
        println(name)
    }

    for (i in 1..  10) {
        println(i)
    }

    for (i in 1 until 10) {
        println(i)
    }

    //Functions
    fun greetings(name: String) {
        println("Hello $name")
    }

    greetings("Madu!")
}