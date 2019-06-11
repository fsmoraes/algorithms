package MergeSort

import java.util.*
import kotlin.math.floor
import kotlin.math.roundToInt

fun main() {
    val ret = sort(arrayOf(1, 2, 3, 12, 2, -1, 80, 41))
    println(Arrays.toString(ret))
}

fun sort(arr: Array<Int>): Array<Int> {

    if (arr.size <= 1) {
        return arr
    }

    val middle = floor(arr.size / 2.0).roundToInt()
    val left = sort(arr.sliceArray(0 until middle))
    val right = sort(arr.sliceArray(middle until arr.size))

    return merge(left, right)
}


fun merge(arr1: Array<Int>, arr2: Array<Int>): Array<Int> {
    val results = mutableListOf<Int>()

    var i = 0
    var j = 0

    while (i < arr1.size && j < arr2.size) {
        if (arr1[i] < arr2[j]) {
            results.add(arr1[i])
            i++
        } else {
            results.add(arr2[j])
            j++
        }
    }

    while (i < arr1.size) {
        results.add(arr1[i])
        i++
    }

    while (j < arr2.size) {
        results.add(arr2[j])
        j++
    }

    return results.toTypedArray()
}