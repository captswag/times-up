package leetcode._3701

class Solution {

    fun alternatingSum(nums: IntArray): Int {
        var output = 0

        for (index in nums.indices) {
            if (index % 2 == 0) {
                output += nums[index]
            } else {
                output -= nums[index]
            }
        }

        return output
    }
}