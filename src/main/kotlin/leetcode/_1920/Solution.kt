package leetcode._1920

class Solution {
    fun buildArray(nums: IntArray): IntArray {
        val output = IntArray(nums.size)

        for (index in nums.indices) {
            output[index] = nums[nums[index]]
        }

        return output
    }
}