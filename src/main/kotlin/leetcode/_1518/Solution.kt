package leetcode._1518

class Solution {

    fun numWaterBottles(numBottles: Int, numExchange: Int): Int {
        var output = 0
        var fullBottles = numBottles
        var emptyBottles = 0

        while (fullBottles != 0) {
            output += fullBottles
            emptyBottles += fullBottles
            fullBottles = emptyBottles / numExchange
            emptyBottles %= numExchange
        }

        return output
    }
}