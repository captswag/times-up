package leetcode._283

class Solution {
    fun moveZeroes(nums: IntArray): Unit {
        var first = 0
        for (index in nums.indices) {
            if (nums[index] != 0) {
                val temp = nums[first]
                nums[first] = nums[index]
                nums[index] = temp
                first++
            }
        }
    }
}