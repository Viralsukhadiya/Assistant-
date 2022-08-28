package `Making and Loop`

fun main() {

    print("Enter first numbers: ")
    val first = readLine()!!.toDouble()

    print("Enter second numbers: ")
    val second = readLine()!!.toDouble()

    print("Enter an operator (+, -, *, /): ")
    val operator = readLine()!!.toInt()

    val result: Double

    when (operator) {
       1 -> result = first + second
       2 -> result = first - second
       3 -> result = first * second
       4 -> result = first / second
        // operator doesn't match any case constant (+, -, *, /)
        else -> {
            System.out.printf("Error! operator is not correct")
            return
        }
    }

    System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result)
}