package leetcode._3190

class Solution {

    fun minimumOperations(nums: IntArray): Int {
        var minOperations = 0

        for (num in nums) {
            if (num % 3 != 0) {
                minOperations++
            }
        }

        return minOperations
    }
}