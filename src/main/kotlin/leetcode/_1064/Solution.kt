package leetcode._1064

class Solution {
    fun fixedPoint(arr: IntArray): Int {
        var low = 0
        var high = arr.size - 1
        var output = -1

        while (low <= high) {
            val mid = low + (high - low) / 2
            if (arr[mid] == mid) {
                output = mid
                high = mid - 1
            } else if (arr[mid] > mid) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return output
    }
}