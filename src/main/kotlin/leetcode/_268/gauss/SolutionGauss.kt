package leetcode._268.gauss

import leetcode._268.Solution

class SolutionGauss : Solution {

    override fun missingNumber(nums: IntArray): Int {
        val n = nums.size
        val nSum = (n * (n + 1)) / 2

        var cSum = 0
        for (num in nums) {
            cSum += num
        }

        return nSum - cSum
    }
}