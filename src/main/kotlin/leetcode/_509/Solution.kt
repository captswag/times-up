package leetcode._509

class Solution {
    fun fib(n: Int): Int {
        return if (n < 2) {
            n
        } else {
            var a = 0
            var b = 1

            for (currN in 2..n) {
                val next = b + a
                a = b
                b = next
            }

            b
        }
    }
}