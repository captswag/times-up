package leetcode._2869

class Solution {

    fun minOperations(nums: List<Int>, k: Int): Int {
        var cnt = 0
        val seen = BooleanArray(51)
        var i = nums.size - 1

        while (cnt != k) {
            if (nums[i] <= k && !seen[nums[i]]) {
                seen[nums[i]] = true
                cnt++
            }
            i--
        }

        return nums.size - i - 1
    }
}