package leetcode._217

class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val set = mutableSetOf<Int>()

        var output = false
        for (num in nums) {
            if (num in set) {
                output = true
                break
            } else {
                set.add(num)
            }
        }
        return output
    }
}