package leetcode._3010

class Solution {

    fun minimumCost(nums: IntArray): Int {
        var mn = Integer.MAX_VALUE
        var smn = Integer.MAX_VALUE

        for (i in 1 until nums.size) {
            if (nums[i] < mn) {
                smn = mn
                mn = nums[i]
            } else if (nums[i] < smn) {
                smn = nums[i]
            }
        }

        return nums[0] + mn + smn
    }
}