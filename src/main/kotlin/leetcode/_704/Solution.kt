package leetcode._704

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var low = 0
        var high = nums.size - 1
        var output = -1

        while (low <= high) {
            val mid = low + (high - low) / 2

            if (nums[mid] == target) {
                output = mid
                break
            } else if (target > nums[mid]) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return output
    }
}