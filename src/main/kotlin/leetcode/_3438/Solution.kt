package leetcode._3438

class Solution {

    fun findValidPair(s: String): String {
        val frequency = IntArray(10)

        for (c in s) {
            frequency[c - '0']++
        }

        for (index in 0 until s.length - 1) {
            val first = s[index] - '0'
            val second = s[index + 1] - '0'
            if (first != second && frequency[first] == first && frequency[second] == second) {
                return "${first}${second}"
            }
        }

        return ""
    }
}