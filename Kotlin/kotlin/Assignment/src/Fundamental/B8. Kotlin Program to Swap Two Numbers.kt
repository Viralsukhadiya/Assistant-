package Fundamental

fun main() {

    var first = 3.20f
    var second = 4.45f

    println("--Before swap--")
    println("First number = $first")
    println("Second number = $second")


    val temporary = first


    first = second


    second = temporary

    println("--After swap--")
    println("First number = $first")
    println("Second number = $second")
}