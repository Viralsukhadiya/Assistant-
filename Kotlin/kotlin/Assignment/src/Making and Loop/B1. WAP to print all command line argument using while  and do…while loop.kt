package ` Making and Loop`

// Program to print Number 5 times

fun main(args: Array<String>) {

    var i = 1

    while (i <= 5) {
        println("Number $i")
        ++i
    }

    do{
        println("number $i")
        ++i
    }while(i <= 5)
}