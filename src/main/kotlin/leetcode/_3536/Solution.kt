package leetcode._3536

class Solution {

    fun maxProduct(n: Int): Int {
        var max1 = 0
        var max2 = 0
        var number = n

        while (number != 0) {
            val mod = number % 10

            if (mod > max2) {
                max1 = max2
                max2 = mod
            } else if (mod > max1) {
                max1 = mod
            }
            number /= 10
        }

        return max2 * max1
    }
}