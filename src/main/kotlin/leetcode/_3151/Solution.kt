package leetcode._3151

class Solution {

    fun isArraySpecial(nums: IntArray): Boolean {
        var output = true

        for (index in 0 until nums.size - 1) {
            if ((nums[index] and 1) xor (nums[index + 1] and 1) == 0) {
                output = false
                break
            }
        }

        return output
    }
}