package leetcode._3028

class Solution {

    fun returnToBoundaryCount(nums: IntArray): Int {
        var output = 0
        var sum = 0

        for (num in nums) {
            sum += num
            if (sum == 0) {
                output++
            }
        }

        return output
    }
}