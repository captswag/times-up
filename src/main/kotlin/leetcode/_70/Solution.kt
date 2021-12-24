package leetcode._70

class Solution {
    fun climbStairs(n: Int): Int {
        var prev = 1
        var secondPrev = 0
        var totalSteps = 0

        for (step in 1..n) {
            totalSteps = prev + secondPrev
            secondPrev = prev
            prev = totalSteps
        }

        return totalSteps
    }
}