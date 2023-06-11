package leetcode._2733

class Solution {

    fun findNonMinOrMax(nums: IntArray): Int {
        return if (nums.size < 3) {
            -1
        } else {
            val a = Math.min(nums[0], nums[1])
            val b = Math.max(nums[0], nums[1])
            val c = nums[2]

            if (c < a) {
                a
            } else if (c > b) {
                b
            } else {
                c
            }
        }
    }
}