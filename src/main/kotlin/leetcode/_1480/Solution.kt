package leetcode._1480

class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var index = 0

        var currentSum = nums[index]
        index++

        while (index < nums.size) {
            nums[index] = nums[index] + currentSum
            currentSum = nums[index]
            index++
        }

        return nums
    }
}