package leetcode._1134

class Solution {
    fun isArmstrong(n: Int): Boolean {
        val k = countDigits(n)
        var number = n
        var sum = 0

        while (number != 0) {
            val digit = number % 10
            var power = 1
            for (index in 0 until k) {
                power *= digit
            }
            sum += power
            number /= 10
        }

        return n == sum
    }

    private fun countDigits(n: Int): Int = when (n) {
        in 0..9 -> 1
        in 10..99 -> 2
        in 100..999 -> 3
        in 1000..9999 -> 4
        in 10000..99999 -> 5
        in 100000..999999 -> 6
        in 1000000..9999999 -> 7
        in 10000000..99999999 -> 8
        100000000 -> 9
        else -> 10 // Won't go to else since max value is 100000000
    }
}