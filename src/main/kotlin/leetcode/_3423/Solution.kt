package leetcode._3423

class Solution {

    fun maxAdjacentDistance(nums: IntArray): Int {
        var output = Math.abs(nums[0] - nums[1])

        for (index in 1 until nums.size) {
            output = Math.max(output, Math.abs(nums[index] - nums[(index + 1) % nums.size]))
        }

        return output
    }
}