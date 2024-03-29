package leetcode._2455

class Solution {

    fun averageValue(nums: IntArray): Int {
        var sum = 0
        var count = 0

        for (num in nums) {
            if (num % 2 == 0 && num % 3 == 0) {
                sum += num
                count++
            }
        }

        return if (count == 0) {
            0
        } else {
            sum / count
        }
    }
}