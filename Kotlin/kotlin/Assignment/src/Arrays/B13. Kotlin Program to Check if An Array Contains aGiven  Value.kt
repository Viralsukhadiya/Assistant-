package Arrays

fun main(args: Array<String>) {

    val num = intArrayOf(1, 2, 4, 3, 5)
    val toFind = 3
    var found = false

    for (n in num) {
        if (n == toFind) {
            found = true
            break
        }
    }

    if (found)
        println("$toFind is found.")
    else
        println("$toFind is not found.")
}