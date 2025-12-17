package refresh._1137

class Solution {

    fun tribonacci(n: Int): Int {
        return if (n < 2) {
            n
        } else if (n == 2) {
            1
        } else {
            var a = 0
            var b = 1
            var c = 1

            for (currN in 3..n) {
                val next = c + b + a
                a = b
                b = c
                c = next
            }

            c
        }
    }
}