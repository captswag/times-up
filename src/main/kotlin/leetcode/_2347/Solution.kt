package leetcode._2347

class Solution {
    fun bestHand(ranks: IntArray, suits: CharArray): String {
        val ranksMap = mutableMapOf<Int, Int>()
        var maxRankCount = 0
        for (rank in ranks) {
            val count = ranksMap.getOrDefault(rank, 0) + 1
            ranksMap[rank] = count
            if (count > maxRankCount) {
                maxRankCount = count
            }
        }

        val suitsCount = IntArray(4)
        var maxSuitCount = 0
        for (suit in suits) {
            suitsCount[suit - 'a']++
            if (suitsCount[suit - 'a'] > maxSuitCount) {
                maxSuitCount = suitsCount[suit - 'a']
            }
        }

        return if (maxSuitCount == 5) {
            "Flush"
        } else if (maxRankCount >= 3) {
            "Three of a Kind"
        } else if (maxRankCount == 2) {
            "Pair"
        } else {
            "High Card"
        }
    }
}