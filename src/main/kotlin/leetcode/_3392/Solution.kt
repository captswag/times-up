package leetcode._3392

class Solution {

    fun countSubarrays(nums: IntArray): Int {
        var output = 0

        for (index in 0 until nums.size - 2) {
            val secondHalf = nums[index + 1]
            if ((nums[index] + nums[index + 2]) * 2 == secondHalf) {
                output++
            }
        }

        return output
    }
}