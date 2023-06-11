package leetcode._1189

class Solution {

    fun maxNumberOfBalloons(text: String): Int {
        val map = mapOf(0 to 1, 1 to 1, 11 to 2, 13 to 1, 14 to 2)
        val charCountArray = IntArray(26)

        for (c in text) {
            charCountArray[c - 'a']++
        }

        var min = charCountArray[0]
        for (index in map.keys) {
            min = Math.min(min, charCountArray[index] / map.getOrDefault(index, 1))
        }
        return min
    }
}