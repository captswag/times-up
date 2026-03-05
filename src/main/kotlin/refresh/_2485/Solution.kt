package refresh._2485

class Solution {

    fun pivotInteger(n: Int): Int {
        var l = 1
        var r = n
        val total = (n * (n + 1)) / 2

        while (l <= r) {
            val mid = (l + r) ushr 1
            val ls = (mid * (mid + 1)) / 2
            val rs = total - ls + mid

            if (ls == rs) {
                return mid
            } else if (ls < rs) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }

        return -1
    }
}