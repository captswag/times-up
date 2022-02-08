package leetcode._1342

class Solution {
    fun numberOfSteps(num: Int): Int {
        var number = num
        var output = 0

        while (number != 0) {
            if (number % 2 == 0) {
                number /= 2
            } else {
                number -= 1
            }
            output++
        }

        return output
    }
}