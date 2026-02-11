package refresh._3726

class Solution {

    fun removeZeros(n: Long): Long {
        var x = n
        var ans = 0L
        var p = 1L

        while (x != 0L) {
            val d = x % 10
            if (d != 0L) {
                ans += (d * p)
                p *= 10
            }
            x /= 10
        }

        return ans
    }
}