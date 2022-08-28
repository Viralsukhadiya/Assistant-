package `Making and Loop`

fun main() {
    val rows = 9

    for (i in 1..rows) {
        for (j in 1..i) {
            print("$j ")
        }
        println()
    }
}