package leetcode._2535

class Solution {

    fun differenceOfSum(nums: IntArray): Int {
        var elementSum = 0
        var digitSum = 0

        for (num in nums) {
            var number = num
            elementSum += number
            while (number != 0) {
                digitSum += (number % 10)
                number /= 10
            }
        }

        return Math.abs(elementSum - digitSum)
    }
}