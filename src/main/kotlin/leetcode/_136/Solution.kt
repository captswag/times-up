package leetcode._136

class Solution {

    fun singleNumber(nums: IntArray): Int {
        var output = 0

        for (num in nums) {
            output = output xor num
        }

        return output
    }
}