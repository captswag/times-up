package leetcode._3452

class Solution {

    fun sumOfGoodNumbers(nums: IntArray, k: Int): Int {
        var output = 0

        for (index in nums.indices) {
            var isGood = true

            if (index - k >= 0) {
                if (nums[index] <= nums[index - k]) {
                    isGood = false
                }
            }

            if (index + k < nums.size) {
                if (nums[index] <= nums[index + k]) {
                    isGood = false
                }
            }

            if (isGood) {
                output += nums[index]
            }
        }

        return output
    }
}