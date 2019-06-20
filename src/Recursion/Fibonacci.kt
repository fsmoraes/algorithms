package Recursion

fun main() {
    println(fib(4))
    println(fib(10))
}

fun fib(num: Int): Int {
    if (num < 2)
        return num

    return fib(num - 1) + fib(num - 2)
}
