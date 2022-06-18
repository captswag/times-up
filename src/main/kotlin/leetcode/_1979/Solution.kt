package leetcode._1979

class Solution {
    fun findGCD(nums: IntArray): Int {
        var index = 0
        var smallest = nums[index]
        var largest = nums[index]

        for (index in 1 until nums.size) {
            if (nums[index] < smallest) {
                smallest = nums[index]
            }
            if (nums[index] > largest) {
                largest = nums[index]
            }
        }

        return findGCD(largest, smallest)
    }

    private fun findGCD(number1: Int, number2: Int): Int {
        if (number1 == 0 || number2 == 0) {
            return if (number1 == 0) number2 else number1
        } else {
            return findGCD(number2, number1 % number2)
        }
    }
}