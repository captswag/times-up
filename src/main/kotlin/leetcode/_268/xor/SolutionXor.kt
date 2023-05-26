package leetcode._268.xor

import leetcode._268.Solution

class SolutionXor : Solution {

    override fun missingNumber(nums: IntArray): Int {
        var output = nums.size
        for (index in nums.indices) {
            output = output xor nums[index] xor index
        }
        return output
    }
}