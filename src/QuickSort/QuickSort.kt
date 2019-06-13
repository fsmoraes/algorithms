package QuickSort

import java.util.*

fun main() {
    val ret = sort(arrayOf(6, 5, 4, 3, 2, 1))
    println(Arrays.toString(ret))
}

// Time Complexity is O(n log n)
// In the Worst Case is O(n²), this occurs when data is already sorted or the pivot is the minimum or maximum value picked of the array
fun sort(arr: Array<Int>, left: Int = 0, right: Int = arr.size - 1): Array<Int> {

    if (left < right) {
        val pivotIndex = pivot(arr, left, right)

        //left side
        sort(arr, left, pivotIndex - 1)

        //right side
        sort(arr, pivotIndex + 1, right)
    }

    return arr

}

fun pivot(arr: Array<Int>, start: Int = 0, end: Int = arr.size - 1): Int {

    val pivot = arr[start]
    var swapIndex = start

    for (i in start + 1..end) {
        if (pivot > arr[i]) {
            swapIndex++
            swap(arr, swapIndex, i)
        }
    }

    if (start != swapIndex) {
        swap(arr, start, swapIndex)
    }

    return swapIndex
}

fun swap(arr: Array<Int>, i: Int, j: Int) {
    val temp = arr[i]
    arr[i] = arr[j]
    arr[j] = temp
}