package refresh._1876

class Solution {

    fun countGoodSubstrings(s: String): Int {
        return if (s.length < 3) {
            0
        } else {
            var count = 0
            var a = s[0]
            var b = s[1]

            for (index in 2 until s.length) {
                val c = s[index]
                if (a != b && b != c && a != c) {
                    count++
                }
                a = b
                b = c
            }

            return count
        }
    }
}