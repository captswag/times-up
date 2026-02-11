package refresh._3622

class Solution {

    fun checkDivisibility(n: Int): Boolean {
        var x = n
        var sum = 0
        var prod = 1

        while (x != 0) {
            sum += (x % 10)
            prod *= (x % 10)
            x /= 10
        }

        return n % (sum + prod) == 0
    }
}