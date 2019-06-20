package Recursion

fun main() {
    println(recursiveRange(10))
    println(recursiveRange(6))
}

fun recursiveRange(num: Int): Int {
    if (num == 0)
        return 0

    return num + recursiveRange(num - 1)
}