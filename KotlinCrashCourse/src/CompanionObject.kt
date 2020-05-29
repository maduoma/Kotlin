class Home {
    var myNum1: Int = 0

    companion object { //Companion object like static in Java
        var myNum2: Int = 0
    }
}

fun main() {
    println("============All the object will get its own copy of the dynamic myNum1=============")
    val a = Home()
    a.myNum1++
    println(a.myNum1)

    println("============All the object will get its own copy of the dynamic myNum1=============")
    val b = Home()
    b.myNum1++
    println(b.myNum1)

    println("=======All the object of the class will get the same single static variable myNum2======")
    Home.myNum2++
    Home.myNum2++
    println(Home.myNum2)
}