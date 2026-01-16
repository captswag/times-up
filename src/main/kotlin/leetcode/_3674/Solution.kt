package leetcode._3674

class Solution {

    fun minOperations(nums: IntArray): Int {
        for (i in 1 until nums.size) {
            if (nums[i] != nums[i - 1]) {
                return 1
            }
        }
        return 0
    }
}