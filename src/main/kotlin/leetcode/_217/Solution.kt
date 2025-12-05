package leetcode._217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        for (num in nums) {
            if (set.contains(num)) {
                return true
            } else {
                set.add(num)
            }
        }

        return false
    }
}