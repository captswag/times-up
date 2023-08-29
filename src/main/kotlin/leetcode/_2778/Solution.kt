package leetcode._2778

class Solution {

    fun sumOfSquares(nums: IntArray): Int {
        var sum = 0

        for (index in nums.indices) {
            if (nums.size % (index + 1) == 0) {
                sum += (nums[index] * nums[index])
            }
        }

        return sum
    }
}