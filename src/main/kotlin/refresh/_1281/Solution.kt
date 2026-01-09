package refresh._1281

class Solution {

    fun subtractProductAndSum(n: Int): Int {
        var num = n
        var product = 1
        var sum = 0

        while (num != 0) {
            val mod = num % 10
            product *= mod
            sum += mod
            num /= 10
        }

        return product - sum
    }
}