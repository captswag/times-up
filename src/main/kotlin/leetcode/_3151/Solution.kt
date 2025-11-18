package leetcode._3151

class Solution {

    fun isArraySpecial(nums: IntArray): Boolean {
        var output = true

        for (index in 0 until nums.size - 1) {
            if (nums[index] % 2 == nums[index + 1] % 2) {
                output = false
                break
            }
        }

        return output
    }
}