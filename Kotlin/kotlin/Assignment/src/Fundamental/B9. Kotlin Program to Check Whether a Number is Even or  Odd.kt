package Fundamental

fun main() {

    var reader = readLine()!!.toInt()

    print("Enter a number: ")

    var num = reader

    if(num%2 == 0) {
        println("$num is even")
    }else {
        println("$num is odd")
    }
}