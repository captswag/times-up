package refresh._2544

class Solution {

    fun alternateDigitSum(n: Int): Int {
        var sum = 0
        var x = n
        var pv = highestPow10(x)
        var sign = 1

        while (x > 0) {
            sum += ((x / pv) * sign)
            x %= pv
            pv /= 10
            sign *= -1
        }

        return sum
    }

    private fun highestPow10(n: Int): Int {
        return when {
            n < 10 -> {
                1
            }
            n < 100 -> {
                10
            }
            n < 1000 -> {
                100
            }
            n < 10000 -> {
                1000
            }
            n < 100000 -> {
                10000
            }
            n < 1000000 -> {
                100000
            }
            n < 10000000 -> {
                1000000
            }
            n < 100000000 -> {
                10000000
            }
            n < 1000000000 -> {
                100000000
            }
            else -> {
                1000000000
            }
        }
    }
}