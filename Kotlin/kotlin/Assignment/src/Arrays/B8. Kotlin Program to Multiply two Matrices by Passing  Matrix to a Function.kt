package Arrays

fun main() {
    val r1 = 2
    val c1 = 2
    val r2 = 3
    val c2 = 2
    val firstMatrix = arrayOf(intArrayOf(3, -4, 5), intArrayOf(3, 0, 4))
    val secondMatrix = arrayOf(intArrayOf(2, 3), intArrayOf(-5, 0), intArrayOf(0, 3))

    // Mutliplying Two matrices
    val product = multiplyMatrices(firstMatrix,
        secondMatrix,
        r1,
        c1,
        c2)

    // Displaying the result
    displayProduct(product)
}

fun multiplyMatrices(firstMatrix: Array <IntArray>,
                     secondMatrix: Array <IntArray>,
                     r1: Int,
                     c1: Int,
                     c2: Int): Array <IntArray> {
    val product = Array(r1) { IntArray(c2) }
    for (i in 0..r1 - 1) {
        for (j in 0..c2 - 1) {
            for (k in 0..c1 - 1) {
                product[i][j] += firstMatrix[i][k] * secondMatrix[k][j]
            }
        }
    }

    return product
}

fun displayProduct(product: Array <IntArray>) {
    println("Product of two matrices is: ")
    for (row in product) {
        for (column in row) {
            print("$column    ")
        }
        println()
    }
}