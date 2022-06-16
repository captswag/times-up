package leetcode._2169

class Solution {
    fun countOperations(num1: Int, num2: Int): Int {
        var number1 = num1
        var number2 = num2

        var diff = if (num1 == 0 || num2 == 0) {
            0
        } else {
            -1
        }
        var output = 0

        while (diff != 0) {
            if (number1 > number2) {
                diff = number1 - number2
                number1 = diff
            } else {
                diff = number2 - number1
                number2 = diff
            }
            output++
        }

        return output
    }
}