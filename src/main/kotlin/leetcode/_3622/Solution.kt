package leetcode._3622

class Solution {

    fun checkDivisibility(n: Int): Boolean {
        var number = n
        var sum = 0
        var product = 1

        while (number != 0) {
            val mod = number % 10
            sum += mod
            product *= mod
            number /= 10
        }

        return n % (sum + product) == 0
    }
}