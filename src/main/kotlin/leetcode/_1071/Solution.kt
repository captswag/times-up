package leetcode._1071

class Solution {
    fun gcdOfStrings(str1: String, str2: String): String {
        var output = ""
        if ("$str1$str2" == "$str2$str1") {
            val gcd = findGcd(str1.length, str2.length)
            output = str1.substring(0, gcd)
        }
        return output
    }

    private fun findGcd(number1: Int, number2: Int): Int {
        return if (number1 == 0 || number2 == 0) {
            return if (number1 == 0) number2 else number1
        } else {
            return findGcd(number2, number1 % number2)
        }
    }
}