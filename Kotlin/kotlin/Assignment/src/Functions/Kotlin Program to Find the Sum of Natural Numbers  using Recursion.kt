package Functions

fun main() {
    val number = 30
    val sum = addNumbers(number)
    println("Sum = $sum")
}

fun addNumbers(num: Int): Int {
    if (num != 0)
        return num + addNumbers(num - 1)
    else
        return num
}