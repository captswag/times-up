package leetcode._1150

class Solution {
    fun isMajorityElement(nums: IntArray, target: Int): Boolean {
        // Find the element at the last index and the first index
        var firstIndex: Int? = null
        var lastIndex: Int? = null

        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                firstIndex = mid
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        low = 0
        high = nums.size - 1
        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                lastIndex = mid
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        val diff: Int = if (firstIndex != null && lastIndex != null) {
            lastIndex - firstIndex + 1
        } else {
            0
        }

        return diff > nums.size / 2
    }
}