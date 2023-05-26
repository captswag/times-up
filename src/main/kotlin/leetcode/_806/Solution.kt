package leetcode._806

class Solution {
    fun numberOfLines(widths: IntArray, s: String): IntArray {
        var lines = 1
        var width = 0

        for (c in s) {
            val pixels = widths[c - 'a']
            width += pixels

            if (width > 100) {
                lines++
                width = pixels
            }
        }

        return intArrayOf(lines, width)
    }
}