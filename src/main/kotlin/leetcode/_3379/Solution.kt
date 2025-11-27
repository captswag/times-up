package leetcode._3379

class Solution {

    fun constructTransformedArray(nums: IntArray): IntArray {
        val transformedNums = IntArray(nums.size)

        for (index in nums.indices) {
            if (nums[index] < 0) {
                val steps = (nums[index] * -1) % nums.size
                val targetIndex = (index - steps + nums.size) % nums.size
                transformedNums[index] = nums[targetIndex]
            } else {
                val targetIndex = (index + nums[index]) % nums.size
                transformedNums[index] = nums[targetIndex]
            }
        }

        return transformedNums
    }
}