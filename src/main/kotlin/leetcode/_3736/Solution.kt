package leetcode._3736

class Solution {

    fun minMoves(nums: IntArray): Int {
        var max = nums[0]

        for (index in 1 until nums.size) {
            if (nums[index] > max) {
                max = nums[index]
            }
        }

        var output = 0
        for (num in nums) {
            output += (max - num)
        }

        return output
    }
}