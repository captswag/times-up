package refresh._70

class Solution {

    fun climbStairs(n: Int): Int {
        return if (n < 3) {
            n
        } else {
            var a = 1
            var b = 2

            for (currN in 3..n) {
                val next = b + a
                a = b
                b = next
            }

            b
        }
    }
}