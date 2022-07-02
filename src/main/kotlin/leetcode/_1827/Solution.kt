package leetcode._1827

class Solution {
    fun minOperations(nums: IntArray): Int {
        var output = 0
        for (index in 1 until nums.size) {
            if (nums[index] <= nums[index - 1]) {
                val operations = (nums[index - 1] + 1) - nums[index]
                nums[index] = nums[index] + operations
                output += operations
            }
        }
        return output
    }
}