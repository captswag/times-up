package leetcode._2460

class Solution {

    fun applyOperations(nums: IntArray): IntArray {
        for (index in 1 until nums.size) {
            if (nums[index - 1] == nums[index]) {
                nums[index - 1] *= 2
                nums[index] = 0
            }
        }

        var zeroIndex = 0
        for (index in nums.indices) {
            if (nums[index] != 0) {
                val temp = nums[index]
                nums[index] = nums[zeroIndex]
                nums[zeroIndex] = temp
                zeroIndex++
            }
        }

        return nums
    }
}