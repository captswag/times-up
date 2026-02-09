package leetcode._3498

class Solution {

    fun reverseDegree(s: String): Int {
        var sum = 0

        for (i in s.indices) {
            sum += ((i + 1) * (26 - (s[i] - 'a')))
        }

        return sum
    }
}