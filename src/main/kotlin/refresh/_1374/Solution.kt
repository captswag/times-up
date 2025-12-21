package refresh._1374

class Solution {

    fun generateTheString(n: Int): String {
        val c = CharArray(n)
        var cIndex = 0

        if (n and 1 == 0) {
            c[cIndex++] = 'b'
        }

        while (cIndex < c.size) {
            c[cIndex++] = 'a'
        }

        return String(c)
    }
}