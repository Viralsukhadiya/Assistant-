package Class_Objects

data class Data(val name:String,val age:Int)

// A function returning two values
fun sendData():Data{
    return Data("Viral",22)
}

fun main(){
    val obj = sendData()
    //  Using instance to access properties
    println("Name is ${obj.name}")
    println("Age is ${obj.age}")

}