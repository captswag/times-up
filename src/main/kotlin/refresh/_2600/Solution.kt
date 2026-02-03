package refresh._2600

import kotlin.math.min

class Solution {

    fun kItemsWithMaximumSum(numOnes: Int, numZeros: Int, numNegOnes: Int, k: Int): Int {
        var k = k
        var numOnes = numOnes
        var numZeros = numZeros
        var numNegOnes = numNegOnes
        var sum = 0

        while (k != 0) {
            if (numOnes != 0) {
                val min = min(k, numOnes)
                k -= min
                numOnes -= min
                sum += min
            } else if (numZeros != 0) {
                val min = min(k, numZeros)
                k -= min
                numZeros -= min
            } else {
                val min = min(k, numNegOnes)
                k -= min
                numNegOnes -= min
                sum -= min
            }
        }

        return sum
    }
}