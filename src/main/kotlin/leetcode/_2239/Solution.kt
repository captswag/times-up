package leetcode._2239

class Solution {
    fun findClosestNumber(nums: IntArray): Int {
        var closestNegative = -100001
        var closestPositive = 100001

        for (num in nums) {
            if (num < 0) { // Negative number
                if (num > closestNegative) {
                    closestNegative = num
                }
            } else { // Positive number
                if (num < closestPositive) {
                    closestPositive = num
                }
            }
        }

        val distanceToZeroNegative = 0 - closestNegative
        val distanceToZeroPositive = closestPositive - 0

        return if (distanceToZeroNegative < distanceToZeroPositive) {
            closestNegative
        } else {
            closestPositive
        }
    }
}