package refresh._1281

class Solution {

    fun subtractProductAndSum(n: Int): Int {
        var x = n
        var prod = 1
        var sum = 0

        while (x != 0) {
            val d = x % 10
            prod *= d
            sum += d
            x /= 10
        }

        return prod - sum
    }
}