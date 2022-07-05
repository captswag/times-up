package leetcode._1313

class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var size = 0
        for (index in nums.indices step 2) {
            size += nums[index]
        }
        val output = IntArray(size)
        var outputIndex = 0

        for (index in 1 until nums.size step 2) {
            for (fIndex in 0 until nums[index - 1]) {
                output[outputIndex++] = nums[index]
            }
        }

        return output
    }
}