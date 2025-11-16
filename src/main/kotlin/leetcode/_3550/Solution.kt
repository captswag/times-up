package leetcode._3550

class Solution {
    fun smallestIndex(nums: IntArray): Int {
        var output = -1

        for (index in nums.indices) {
            if (index == findDigitSum(nums[index])) {
                output = index
                break
            }
        }

        return output
    }

    private fun findDigitSum(num: Int): Int {
        var number = num
        var sum = 0

        while (number != 0) {
            sum += number % 10
            number /= 10
        }

        return sum
    }
}