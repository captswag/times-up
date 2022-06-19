package leetcode._1221

class Solution {
    fun balancedStringSplit(s: String): Int {
        var output = 0
        var rCount = 0
        var lCount = 0

        for (c in s) {
            if (c == 'R') {
                rCount++
                if (rCount == lCount) {
                    output++
                    rCount = 0
                    lCount = 0
                }
            } else {
                lCount++
                if (rCount == lCount) {
                    output++
                    rCount = 0
                    lCount = 0
                }
            }
        }

        return output
    }
}