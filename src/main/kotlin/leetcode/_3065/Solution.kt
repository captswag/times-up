package leetcode._3065

class Solution {

    fun minOperations(nums: IntArray, k: Int): Int {
        var greaterThanOrEqualTo = 0

        for (num in nums) {
            if (num >= k) {
                greaterThanOrEqualTo++
            }
        }

        return nums.size - greaterThanOrEqualTo
    }
}