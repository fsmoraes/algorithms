package BubbleSort

import java.util.*

fun main() {
    var ret = sort(arrayOf(5,3,2,8,1,4,10,15,11,13,18,20))
    println(Arrays.toString(ret))
}

//In general the complexity is square O(n²)
//but if the array was nearly sorted is linear O(n)
fun sort(arr: Array<Int>) : Array<Int>{
    var noSwap: Boolean

    for (i in arr.size downTo 0 step 1) {
        noSwap = true
        for(j in 0 until i - 1) {
            if (arr[j] > arr[j+1]) {
                val temp = arr[j]
                arr[j] = arr[j+1]
                arr[j+1] = temp
                noSwap = false
            }
        }
        if (noSwap) {
            break
        }
    }
    return arr
}

