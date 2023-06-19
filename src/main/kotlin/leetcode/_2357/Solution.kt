package leetcode._2357

class Solution {
    fun minimumOperations(nums: IntArray): Int {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (num != 0) {
                set.add(num)
            }
        }

        return set.size
    }
}