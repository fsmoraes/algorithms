package Recursion

fun main() {
    println(productOfArray(arrayOf(1, 2, 3, 6)))
}

fun productOfArray(arr: Array<Int>): Int {

    if (arr.isEmpty())
        return 1

    return arr[0] * productOfArray(arr.sliceArray(1 until arr.size))
}