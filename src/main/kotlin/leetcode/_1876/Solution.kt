package leetcode._1876

class Solution {
    fun countGoodSubstrings(s: String): Int {
        var output = 0
        return if (s.length < 3) {
            output
        } else {
            var a = s[0]
            var b = s[1]
            for (index in 2 until s.length) {
                val c = s[index]
                if (!(a == b || b == c || a == c)) {
                    output++
                }
                a = b
                b = c
            }
            output
        }
    }
}