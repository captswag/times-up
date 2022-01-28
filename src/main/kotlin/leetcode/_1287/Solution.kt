package leetcode._1287

class Solution {
    fun findSpecialInteger(arr: IntArray): Int {
        val threshold = (arr.size * 25) / 100

        var count = 1
        var prev = arr[0]
        var output = prev

        for (index in 1 until arr.size) {
            if (prev == arr[index]) {
                count++
            } else {
                count = 1
            }
            prev = arr[index]

            if (count > threshold) {
                output = arr[index]
                break
            }
        }
        return output
    }
}