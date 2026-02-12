package leetcode._3264

class Solution {

    fun getFinalState(nums: IntArray, k: Int, multiplier: Int): IntArray {
        for (i in 0 until k) {
            var idx = 0

            for (j in 1 until nums.size) {
                if (nums[j] < nums[idx]) {
                    idx = j
                }
            }

            nums[idx] *= multiplier
        }

        return nums
    }
}