class Home {
    var myNum1: Int = 0

    companion object {
        var myNum2: Int = 0
    }
}

fun main() {
    println("========================================================")
    val a = Home()
    a.myNum1++
    println(a.myNum1)

    println("========================================================")
    val b = Home()
    b.myNum1++
    println(b.myNum1)

    println("========================================================")
    Home.myNum2++
    Home.myNum2++
    println(Home.myNum2)
}