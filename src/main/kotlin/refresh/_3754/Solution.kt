package refresh._3754

class Solution {

    fun sumAndMultiply(n: Int): Long {
        var x = n
        var sum = 0
        var num = 0
        var pv = 1

        while (x != 0) {
            val d = x % 10
            if (d != 0) {
                sum += d
                num += (pv * d)
                pv *= 10
            }
            x /= 10
        }

        return sum.toLong() * num.toLong()
    }
}