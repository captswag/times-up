package leetcode._3019

class Solution {

    fun countKeyChanges(s: String): Int {
        var prev = s[0].lowercaseChar() - 'a'
        var output = 0

        for (index in 1 until s.length) {
            val curr = s[index].lowercaseChar() - 'a'

            if (curr != prev) {
                output++
                prev = curr
            }
        }

        return output
    }
}