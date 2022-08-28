package `Making and Loop`

fun main() {

    val num = 1000
    var sum = 0

    for (i in 1..num) {
        // sum = sum+i;
        sum += i
    }

    println("Sum = $sum")
}