fun main(args: Array<String>) {
    var fish = 2
    println(fish.times(2))
    println(fish.div(2))
    println(fish.minus(1))
    println(fish.plus(1))

    println("Variable Declaration")
    var b: Int = 2
    println("B is "+b)

    println("Casting")
    var d: Byte = 1
    var c: Number = 4
    println(c.toLong())
    println(c.toFloat())
    println(d.toInt())
}