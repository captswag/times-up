package leetcode._2427

class Solution {

    fun commonFactors(a: Int, b: Int): Int {
        val gcd = gcd(a, b)
        var commonFactors = 1

        for (i in 2..gcd) {
            if (a % i == 0 && b % i == 0) {
                commonFactors++
            }
        }

        return commonFactors
    }

    private fun gcd(a: Int, b: Int): Int {
        val mod = a % b
        return if (mod == 0) {
            b
        } else {
            gcd(b, mod)
        }
    }
}