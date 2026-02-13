package leetcode._1708

class Solution {

    fun largestSubarray(nums: IntArray, k: Int): IntArray {
        var idx = 0

        for (i in 1 until nums.size - k + 1) {
            if (nums[i] > nums[idx]) {
                idx = i
            }
        }

        val ans = IntArray(k)
        var i = 0
        val end = idx + k

        while (idx < end) {
            ans[i++] = nums[idx++]
        }

        return ans
    }
}