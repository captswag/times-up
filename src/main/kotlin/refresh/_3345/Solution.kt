package refresh._3345

class Solution {

    fun smallestNumber(n: Int, t: Int): Int {
        var num = n
        var prod = digitProd(num)

        while (prod % t != 0) {
            num++
            prod = digitProd(num)
        }

        return num
    }

    private fun digitProd(num: Int): Int {
        var x = num
        var prod = 1
        while (x != 0) {
            prod *= (x % 10)
            x /= 10
        }

        return prod
    }
}