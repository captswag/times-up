package leetcode._1614

class Solution {
    fun maxDepth(s: String): Int {
        var output = 0
        var count = 0

        for (c in s) {
            if (c == '(') {
                count++
                output = Math.max(output, count)
            } else if (c == ')') {
                count--
            }
        }

        return output
    }
}