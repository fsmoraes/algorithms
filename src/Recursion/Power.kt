package Recursion

fun main() {

    println(power(2, 2))
    println(power(2, 3))
}

fun power(base: Int, exp: Int): Int {
    if (exp == 0)
        return 1

    return base * power(base, exp - 1)
}