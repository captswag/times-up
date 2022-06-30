package leetcode._1228

class Solution {
    fun missingNumber(arr: IntArray): Int {
        val ascending = arr[1] > arr[0]
        val diff1 = arr[1] - arr[0]
        val diff2 = arr[arr.size - 1] - arr[arr.size - 2]
        val diff = if (ascending) {
            Math.min(diff1, diff2)
        } else {
            Math.max(diff1, diff2)
        }
        var output = arr[0]

        for (index in 1 until arr.size) {
            if (arr[index] - arr[index - 1] != diff) {
                output = arr[index - 1] + diff
            }
        }

        return output
    }
}