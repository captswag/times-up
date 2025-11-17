package leetcode._3270

class Solution {

    fun generateKey(num1: Int, num2: Int, num3: Int): Int {
        var number1 = num1
        var number2 = num2
        var number3 = num3
        var output = 0
        var placedValue = 1

        for (index in 0..3) {
            val mod1 = number1 % 10
            val mod2 = number2 % 10
            val mod3 = number3 % 10

            output += (minOf(mod1, mod2, mod3) * placedValue)
            placedValue *= 10

            number1 /= 10
            number2 /= 10
            number3 /= 10
        }

        return output
    }
}