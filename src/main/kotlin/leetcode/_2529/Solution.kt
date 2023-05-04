package leetcode._2529

class Solution {

    fun maximumCount(nums: IntArray): Int {
        // Find last negative
        var low = 0
        var high = nums.size - 1
        var negativeIndex = -1

        while (low <= high) {
            val mid = low + ((high - low) / 2)

            if (nums[mid] < 0) { // Number is negative
                negativeIndex = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        // Find first positive
        low = 0
        high = nums.size - 1
        var positiveIndex = nums.size

        while (low <= high) {
            val mid = low + ((high - low) / 2)

            if (nums[mid] > 0) { // Number is positive
                positiveIndex = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        val negativeCount = negativeIndex + 1
        val positiveCount = nums.size - positiveIndex
        return Math.max(negativeCount, positiveCount)
    }
}