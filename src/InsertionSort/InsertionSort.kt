package InsertionSort

import java.util.*

fun main() {
    val ret = sort(arrayOf(2, 1, 9, 80, 4, 10, 24, 75, 66, 99))
    println(Arrays.toString(ret))
}

// Time Complexity is square O(n²)
fun sort(arr: Array<Int>): Array<Int> {

    for (i in 0 until arr.size) {
        val currentVal = arr[i]
        var j = i - 1

        while (j >= 0 && arr[j] > currentVal) {
            arr[j + 1] = arr[j]
            j--
        }

        arr[j + 1] = currentVal
    }

    return arr
}