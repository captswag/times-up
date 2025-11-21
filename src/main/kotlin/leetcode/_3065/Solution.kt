package leetcode._3065

class Solution {

    fun minOperations(nums: IntArray, k: Int): Int {
        var output = 0

        for (num in nums) {
            if (num < k) {
                output++
            }
        }

        return output
    }
}