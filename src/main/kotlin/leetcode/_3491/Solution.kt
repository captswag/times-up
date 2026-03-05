package leetcode._3491

class Solution {

    fun phonePrefix(numbers: Array<String>): Boolean {
        numbers.sort()

        for (i in 1 until numbers.size) {
            if (isPrefix(numbers[i - 1], numbers[i])) {
                return false
            }
        }

        return true
    }

    private fun isPrefix(s: String, t: String): Boolean {
        var i = 0

        while (i < s.length && i < t.length) {
            if (s[i] != t[i]) {
                return false
            }
            i++
        }

        return i == s.length
    }
}