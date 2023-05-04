package leetcode._2553

import java.util.*

class Solution {

    fun separateDigits(nums: IntArray): IntArray {
        var outputArraySize = 0
        for (num in nums) {
            outputArraySize += findDigitLength(num)
        }

        val output = IntArray(outputArraySize)
        var index = 0
        for (num in nums) {
            val stack = Stack<Int>()
            var number = num
            while (number != 0) {
                stack.push(number % 10)
                number /= 10
            }
            while (stack.isNotEmpty()) {
                output[index] = stack.pop()
                index++
            }
        }

        return output
    }

    private fun findDigitLength(num: Int): Int = if (num < 10) {
        1
    } else if (num < 100) {
        2
    } else if (num < 1000) {
        3
    } else if (num < 10000) {
        4
    } else if (num < 100000) {
        5
    } else {
        6
    }
}