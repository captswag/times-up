package leetcode._922

class Solution {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        var evenIndex = 0
        var oddIndex = 1

        while (evenIndex < nums.size && oddIndex < nums.size) {
            if (nums[evenIndex] % 2 == 1 && nums[oddIndex] % 2 == 0) {
                // Swap both the values
                val temp = nums[evenIndex]
                nums[evenIndex] = nums[oddIndex]
                nums[oddIndex] = temp
                evenIndex += 2
                oddIndex += 2
            } else {
                if (nums[evenIndex] % 2 == 0) {
                    evenIndex += 2
                }
                if (nums[oddIndex] % 2 == 1) {
                    oddIndex += 2
                }
            }
        }

        return nums
    }
}