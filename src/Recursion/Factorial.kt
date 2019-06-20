package Recursion

fun main() {
    println(factorial(4))
    println(factorial(8))
}

fun factorial(num: Int): Int {
    if (num == 0)
        return 1

    return num * factorial(num - 1)
}