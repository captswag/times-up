package leetcode._3602

class Solution {

    fun concatHex36(n: Int): String {
        return toBase(n * n, 16) + toBase(n * n * n, 36)
    }

    private fun toBase(n: Int, b: Int): String {
        var x = n
        val sb = StringBuilder()

        while (x != 0) {
            val d = x % b
            if (d < 10) {
                sb.append(d)
            } else {
                sb.append(((d - 10) + 'A'.code).toChar())
            }
            x /= b
        }

        return sb.reverse().toString()
    }
}