package leetcode._1365

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val countArray = IntArray(101)

        for (num in nums) {
            countArray[num]++
        }

        for (index in 1 until countArray.size) {
            countArray[index] += countArray[index - 1]
        }

        val output = IntArray(nums.size)
        for (index in nums.indices) {
            if (nums[index] == 0) {
                output[index] = 0
            } else {
                output[index] = countArray[nums[index] - 1]
            }
        }
        return output
    }
}