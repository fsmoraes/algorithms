package SelectionSort

import java.util.*

fun main() {
    val ret = sort(arrayOf(90, 80, 92, 84, 82, 91, 50, 100, 54, 3, 7, 10, 1))
    println(Arrays.toString(ret))
}

fun sort(arr: Array<Int>): Array<Int> {
    for (i in 0 until arr.size) {
        var lowest = i

        for (j in i + 1 until arr.size) {
            if (arr[lowest] > arr[j]) {
                lowest = j
            }
        }

        if (i != lowest) {
            val temp = arr[i]
            arr[i] = arr[lowest]
            arr[lowest] = temp
        }
    }

    return arr
}