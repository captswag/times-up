package leetcode._1281

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var number = n
        var product = 1
        var sum = 0

        while (number != 0) {
            val mod = number % 10
            number /= 10
            product *= mod
            sum += mod
        }
        return product - sum
    }
}