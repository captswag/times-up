package leetcode._3833

class Solution {

    fun dominantIndices(nums: IntArray): Int {
        var sum = 0

        for (num in nums) {
            sum += num
        }

        var cnt = 0
        for (i in 0 until nums.size - 1) {
            sum -= nums[i]
            if (nums[i] > sum.toDouble() / (nums.size - i - 1)) {
                cnt++
            }
        }

        return cnt
    }
}