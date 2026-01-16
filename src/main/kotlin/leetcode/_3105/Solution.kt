package leetcode._3105

class Solution {

    fun longestMonotonicSubarray(nums: IntArray): Int {
        var max = 1
        var i = 1

        while (i < nums.size) {
            if (nums[i] > nums[i - 1]) {
                var count = 2
                i++
                while (i < nums.size && nums[i] > nums[i - 1]) {
                    count++
                    i++
                }
                if (count > max) {
                    max = count
                }
            } else if (nums[i] < nums[i - 1]) {
                var count = 2
                i++
                while (i < nums.size && nums[i] < nums[i - 1]) {
                    count++
                    i++
                }
                if (count > max) {
                    max = count
                }
            } else {
                i++
            }
        }

        return max
    }
}