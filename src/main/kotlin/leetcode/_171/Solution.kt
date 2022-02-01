package leetcode._171

class Solution {
    fun titleToNumber(columnTitle: String): Int {
        var output = 0
        var multiplier = 1

        for (index in columnTitle.length - 1 downTo 0) {
            val value = columnTitle[index] - 'A' + 1
            output += value * multiplier
            multiplier *= 26
        }

        return output
    }
}