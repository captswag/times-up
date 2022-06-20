package leetcode._1752

class Solution {
    fun check(nums: IntArray): Boolean {
        var index = 1
        var breakPoint = 0

        while (index < nums.size) {
            if (nums[index - 1] > nums[index]) {
                breakPoint++
            }
            index++
        }

        return when (breakPoint) {
            0 -> {
                true
            }
            1 -> {
                nums[nums.size - 1] <= nums[0]
            }
            else -> {
                false
            }
        }
    }
}