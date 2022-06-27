package leetcode._977

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        val output = IntArray(nums.size)
        var endIndex = nums.size - 1
        var index = endIndex
        var startIndex = 0

        while (startIndex <= endIndex) {
            if (Math.abs(nums[startIndex]) > Math.abs(nums[endIndex])) {
                output[index] = nums[startIndex] * nums[startIndex]
                startIndex++
            } else {
                output[index] = nums[endIndex] * nums[endIndex]
                endIndex--
            }
            index--
        }

        return output
    }
}