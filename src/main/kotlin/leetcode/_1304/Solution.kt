package leetcode._1304

class Solution {
    fun sumZero(n: Int): IntArray {
        val output = IntArray(n)
        var index = 0
        var number = n

        if (n % 2 == 1) {
            output[index] = 0
            index++
        }

        while (index < output.size) {
            output[index] = number
            if (number > 0) {
                number *= -1
            } else if (number < 0) {
                number *= -1
                number -= 1
            }
            index++
        }

        return output
    }
}