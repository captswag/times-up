package leetcode._961

class Solution {
    fun repeatedNTimes(nums: IntArray): Int {
        var output = nums[0]
        for (index in 2 until nums.size) {
            if (nums[index] == nums[index - 1] || nums[index] == nums[index - 2]) {
                output = nums[index]
                break
            }
        }
        return output
    }
}