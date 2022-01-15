package leetcode._905

class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        var index = 0
        var swapIndex = 0

        while (index < nums.size) {
            if (nums[index] % 2 == 0) {
                // Means this is an even number
                val temp = nums[index]
                nums[index] = nums[swapIndex]
                nums[swapIndex] = temp
                swapIndex++
            }
            index++
        }

        return nums
    }
}