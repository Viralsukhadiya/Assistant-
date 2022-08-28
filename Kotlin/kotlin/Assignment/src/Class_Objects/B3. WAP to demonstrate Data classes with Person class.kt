package Class_Objects

data class User(val name: String, val age: Int)

fun main() {
    val jack = User("Viral", 25)
    println("name = ${jack.name}")
    println("age = ${jack.age}")
}