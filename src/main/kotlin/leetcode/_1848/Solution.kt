package leetcode._1848

class Solution {
    fun getMinDistance(nums: IntArray, target: Int, start: Int): Int {
        var output = Integer.MAX_VALUE

        for (index in nums.indices) {
            if (nums[index] == target) {
                val diff = Math.abs(index - start)
                if (diff < output) {
                    output = diff
                }
            }
        }

        return output
    }
}