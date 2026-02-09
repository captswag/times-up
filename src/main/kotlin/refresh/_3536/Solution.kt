package refresh._3536

class Solution {

    fun maxProduct(n: Int): Int {
        var mx = 0
        var smx = 0
        var x = n

        while (x != 0) {
            val d = x % 10
            if (d > mx) {
                smx = mx
                mx = d
            } else if (d > smx) {
                smx = d
            }
            x /= 10
        }

        return mx * smx
    }
}