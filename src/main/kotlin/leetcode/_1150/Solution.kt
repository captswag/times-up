package leetcode._1150

class Solution {
    fun isMajorityElement(nums: IntArray, target: Int): Boolean {
        var index = nums.size
        var low = 0
        var high = nums.size - 1

        while (low <= high) {
            val mid = (low + high) ushr 1

            if (nums[mid] == target) {
                index = mid
                high = mid - 1
            } else if (nums[mid] < target) {
                low = mid + 1
            } else {
                high = mid - 1
            }
        }

        return (index + (nums.size / 2) < nums.size) && (nums[index + (nums.size / 2)] == target)
    }
}