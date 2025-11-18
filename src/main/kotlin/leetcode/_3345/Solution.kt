package leetcode._3345

class Solution {

    fun smallestNumber(n: Int, t: Int): Int {
        var output = n

        while (true) {
            val product = productOfDigits(output)
            if (product % t == 0) {
                break
            } else {
                output++
            }
        }

        return output
    }

    private fun productOfDigits(n: Int): Int {
        var product = 1
        var number = n

        while (number != 0) {
            product *= (number % 10)
            number /= 10
        }

        return product
    }
}