package leetcode._506

class Solution {
    fun findRelativeRanks(score: IntArray): Array<String> {
        val output = Array(score.size) { "" } // Initialising the Array of size score.size with ""

        val sortedScore = score.sortedArrayDescending()
        val map = mutableMapOf<Int, String>()

        var index = 0
        while (index < score.size) {
            val rank = index + 1
            map[sortedScore[index]] = if (rank == 1) {
                "Gold Medal"
            } else if (rank == 2) {
                "Silver Medal"
            } else if (rank == 3) {
                "Bronze Medal"
            } else {
                "$rank"
            }
            index++
        }

        index = 0
        while (index < score.size) {
            output[index] = map[score[index]] ?: ""
            index++
        }

        return output
    }
}