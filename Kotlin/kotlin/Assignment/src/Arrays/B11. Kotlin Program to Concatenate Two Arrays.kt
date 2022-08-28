package Arrays

fun concatenate(a: IntArray, b: IntArray): IntArray {
    return a + b
}

fun main() {
    val A = intArrayOf(1, 2, 3)
    val B = intArrayOf(4, 5, 6, 7)

    val concat = concatenate(A, B)

    println(concat.contentToString())        // [1, 2, 3, 4, 5, 6, 7]
}

