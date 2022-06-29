package leetcode._2315

class Solution {
    fun countAsterisks(s: String): Int {
        var verticalBarCount = 0
        var output = 0

        for (c in s) {
            if (c == '|') {
                verticalBarCount++
            } else if (c == '*') {
                if (verticalBarCount % 2 == 0) {
                    output++
                }
            }
        }

        return output
    }
}