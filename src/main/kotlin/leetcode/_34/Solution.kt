package leetcode._34

class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val first = binarySearch(nums, target, true)
        val last = binarySearch(nums, target, false)
        return intArrayOf(first, last)
    }

    private fun binarySearch(nums: IntArray, target: Int, first: Boolean): Int {
        var low = 0
        var high = nums.size - 1
        var index = -1

        while (low <= high) {
            val mid = low + (high - low) / 2
            if (nums[mid] == target) {
                index = mid
                if (first) {
                    high = mid - 1
                } else {
                    low = mid + 1
                }
            } else if (nums[mid] > target) {
                high = mid - 1
            } else {
                low = mid + 1
            }
        }

        return index
    }
}