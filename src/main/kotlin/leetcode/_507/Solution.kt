package leetcode._507

class Solution {
    fun checkPerfectNumber(num: Int): Boolean {
        var output = 0
        val half = num / 2
        var current = 1

        while (current <= half) {
            if (num % current == 0) {
                output += current
            }
            current++
        }

        return output == num
    }
}