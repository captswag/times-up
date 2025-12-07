package leetcode._448

class Solution {
    fun findDisappearedNumbers(nums: IntArray): List<Int> {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            set.add(num)
        }

        val missing = mutableListOf<Int>()
        for (num in 1..nums.size) {
            if (num !in set) {
                missing.add(num)
            }
        }

        return missing
    }
}