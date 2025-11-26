package leetcode._485

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var mc = 0
        var cc = 0

        for (num in nums) {
            if (num == 1) {
                cc++
                if (cc > mc) {
                    mc = cc
                }
            } else {
                cc = 0
            }
        }

        return mc
    }
}