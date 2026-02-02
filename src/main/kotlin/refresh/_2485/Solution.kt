package refresh._2485

class Solution {

    fun pivotInteger(n: Int): Int {
        val tot = (n * (n + 1)) / 2

        for (i in 1..n) {
            val l = (i * (i + 1)) / 2
            val r = tot - l + i
            if (l == r) {
                return i
            }
        }

        return -1
    }
}