package leetcode._2600

class Solution {

    fun kItemsWithMaximumSum(numOnes: Int, numZeros: Int, numNegOnes: Int, k: Int): Int {
        var output = 0
        var kValue = k

        output += Math.min(numOnes, kValue)
        kValue -= output
        kValue -= Math.min(numZeros, kValue)
        output -= Math.min(numNegOnes, kValue)

        return output
    }
}