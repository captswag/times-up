package leetcode._1991

class Solution {
    fun findMiddleIndex(nums: IntArray): Int {
        var rightSum = 0
        for (index in nums.size - 1 downTo 1) {
            rightSum += nums[index]
        }

        var leftSum = 0
        var index = 0
        var secondIndex = 1
        var output = -1
        while (secondIndex <= nums.size) {
            if (leftSum == rightSum) {
                // We found the match
                output = secondIndex - 1
                break
            } else {
                leftSum += nums[index]
                if (secondIndex != nums.size) {
                    rightSum -= nums[secondIndex]
                }
                index++
                secondIndex++
            }
        }

        return output
    }
}