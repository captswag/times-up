package leetcode._2562

import java.util.*

class Solution {

    fun findTheArrayConcVal(nums: IntArray): Long {
        var low = 0
        var high = nums.size - 1
        var output = 0L

        while (low <= high) {
            if (low < high) {
                output += concatenateTwoNumbers(nums[low], nums[high])
            } else {
                output += nums[low]
            }
            low++
            high--
        }

        return output
    }

    private fun concatenateTwoNumbers(num1: Int, num2: Int): Long {
        var number1 = num1.toLong()
        var number2 = num2
        val stack = Stack<Int>()

        while (number2 != 0) {
            stack.push(number2 % 10)
            number2 /= 10
        }

        while (stack.isNotEmpty()) {
            number1 = (number1 * 10) + stack.pop()
        }

        return number1
    }
}