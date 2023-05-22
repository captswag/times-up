package leetcode._908

class Solution {

    fun smallestRangeI(nums: IntArray, k: Int): Int {
        var max = nums[0]
        var min = nums[0]

        for (index in 1 until nums.size) {
            max = Math.max(max, nums[index])
            min = Math.min(min, nums[index])
        }

        return if (max - min > 2 * k) {
            (max - min) - (2 * k)
        } else {
            0
        }
    }
}