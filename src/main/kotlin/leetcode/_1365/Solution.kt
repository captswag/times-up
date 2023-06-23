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

        for (index in nums.indices) {
            nums[index] = if (nums[index] == 0) {
                0
            } else {
                countArray[nums[index] - 1]
            }
        }

        return nums
    }
}