package leetcode._3300

class Solution {

    fun minElement(nums: IntArray): Int {
        var output = Integer.MAX_VALUE

        for (num in nums) {
            var digitSum = 0
            var number = num
            while (number != 0) {
                digitSum += (number % 10)
                number /= 10
            }
            output = Math.min(output, digitSum)
        }

        return output
    }
}