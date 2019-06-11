package MergeSort

import java.util.*

fun main() {
    val ret = merge(arrayOf(1, 2, 3, 12), arrayOf(11, 13, 14))
    println(Arrays.toString(ret))
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