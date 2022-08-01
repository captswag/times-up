package leetcode._2357

class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val output = mutableSetOf<Int>()

        for (num in nums) {
            if (num != 0) {
                output.add(num)
            }
        }

        return output.size
    }
}