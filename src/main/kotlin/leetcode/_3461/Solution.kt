package leetcode._3461

class Solution {

    fun hasSameDigits(s: String): Boolean {
        val c = s.toCharArray()
        var size = c.size

        while (size > 2) {
            for (index in 0 until size - 1) {
                val mod = ((c[index] - '0') + (c[index + 1] - '0')) % 10
                c[index] = mod.digitToChar()
            }
            size--
        }

        return c[0] == c[1]
    }
}