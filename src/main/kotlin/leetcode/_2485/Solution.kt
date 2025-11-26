package leetcode._2485

class Solution {

    fun pivotInteger(n: Int): Int {
        var low = 1
        var high = n

        val totalSum = (n * (n + 1)) / 2
        while (low <= high) {
            val mid = (low + high) ushr 1

            val leftSum = (mid * (mid + 1)) / 2
            val rightSum = totalSum - ((mid - 1) * (mid)) / 2

            if (leftSum == rightSum) {
                return mid
            } else if (leftSum < rightSum) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return -1
    }
}