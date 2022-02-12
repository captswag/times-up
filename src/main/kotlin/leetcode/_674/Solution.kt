package leetcode._674

class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var output = 1
        var currentLongest = 1
        var prev = nums[0]
        var index = 1

        while (index < nums.size) {
            if (nums[index] > prev) {
                currentLongest++
            } else {
                if (currentLongest > output) {
                    output = currentLongest
                }
                currentLongest = 1
            }
            prev = nums[index]
            index++
        }

        if (currentLongest > output) {
            output = currentLongest
        }

        return output
    }
}