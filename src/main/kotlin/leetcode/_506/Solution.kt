package leetcode._506

import java.util.*

class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val rankArray = Array(score.size) { "" }
        val queue = PriorityQueue<Int> { a, b -> score[b] - score[a] }

        for (index in score.indices) {
            queue.add(index)
        }

        var index = 0
        while (queue.isNotEmpty()) {
            rankArray[queue.remove()] = when (++index) {
                1 -> "Gold Medal"
                2 -> "Silver Medal"
                3 -> "Bronze Medal"
                else -> "$index"
            }
        }

        return rankArray
    }
}