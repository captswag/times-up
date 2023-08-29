package leetcode._2744

class Solution {

    fun maximumNumberOfStringPairs(words: Array<String>): Int {
        var count = 0

        for (index in words.indices) {
            for (secondIndex in index + 1 until words.size) {
                if (words[index][0] == words[secondIndex][1] && words[index][1] == words[secondIndex][0]) {
                    count++
                }
            }
        }

        return count
    }
}