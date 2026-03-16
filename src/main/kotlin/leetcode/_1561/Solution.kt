package leetcode._1561

class Solution {

    fun maxCoins(piles: IntArray): Int {
        piles.sortDescending()
        val n = piles.size / 3
        var sum = 0

        for (i in 1 until piles.size - n step 2) {
            sum += piles[i]
        }

        return sum
    }
}