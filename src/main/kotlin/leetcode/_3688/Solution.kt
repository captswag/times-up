package leetcode._3688

class Solution {

    fun evenNumberBitwiseORs(nums: IntArray): Int {
        var output = 0

        for (num in nums) {
            if (num and 1 == 0) {
                output = output or num
            }
        }

        return output
    }
}