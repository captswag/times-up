package leetcode._485

class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var output = 0
        var count = 0
        var index = 0

        while (index <= nums.size) {
            if (index == nums.size || nums[index] != 1) {
                if (count > output) {
                    output = count
                }
                count = 0
            } else {
                count++
            }
            index++
        }

        return output
    }
}