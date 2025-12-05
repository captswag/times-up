package leetcode._136

class Solution {

    fun singleNumber(nums: IntArray): Int {
        var singleNumber = 0

        for (num in nums) {
            singleNumber = singleNumber xor num
        }

        return singleNumber
    }
}