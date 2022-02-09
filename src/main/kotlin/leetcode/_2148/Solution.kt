package leetcode._2148

class Solution {
    fun countElements(nums: IntArray): Int {
        var smallest = nums[0]
        var largest = nums[0]

        for (index in 1 until nums.size) {
            if (nums[index] < smallest) {
                smallest = nums[index]
            }
            if (nums[index] > largest) {
                largest = nums[index]
            }
        }

        var output = 0
        for (num in nums) {
            if (num != smallest && num != largest) {
                output++
            }
        }

        return output
    }
}