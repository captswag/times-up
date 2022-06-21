package leetcode._747

class Solution {
    fun dominantIndex(nums: IntArray): Int {
        var largestIndex = 0
        for (index in 1 until nums.size) {
            if (nums[index] > nums[largestIndex]) {
                largestIndex = index
            }
        }

        var output = largestIndex
        for (index in nums.indices) {
            if (index != largestIndex) {
                if (nums[index] * 2 > nums[largestIndex]) {
                    output = -1
                    break
                }
            }
        }

        return output
    }
}