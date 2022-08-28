package `Making and Loop`

fun main() {
    val base = 4
    var exponent = 4
    var result: Long = 1

    while (exponent != 0) {
        result *= base.toLong()
        --exponent
    }

    println("Answer = $result")
}