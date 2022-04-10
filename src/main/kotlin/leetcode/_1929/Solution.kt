package leetcode._1929

class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val output = IntArray(nums.size * 2)

        for (index in nums.indices) {
            output[index] = nums[index]
        }

        for ((numsIndex, index) in (nums.size until output.size).withIndex()) {
            output[index] = nums[numsIndex]
        }

        return output
    }
}