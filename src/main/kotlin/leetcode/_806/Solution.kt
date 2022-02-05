package leetcode._806

class Solution {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var widthCount = 0
        var index = 0
        var lines = 1
        while (index < s.length) {
            val widthCurrentCharacter = widths[s[index] - 'a']
            val widthCountNext = widthCount + widthCurrentCharacter

            if (widthCountNext <= 100) {
                index++
                widthCount = widthCountNext
            } else {
                lines++
                widthCount = 0
            }
        }

        return intArrayOf(lines, widthCount)
    }
}