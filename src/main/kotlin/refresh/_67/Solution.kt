package refresh._67

import kotlin.math.max

class Solution {

    fun addBinary(a: String, b: String): String {
        val res = CharArray(max(a.length, b.length) + 1)

        var i = a.length - 1
        var j = b.length - 1
        var k = res.size - 1
        var c = 0

        while (i >= 0 && j >= 0) {
            var sum = digit(a[i]) + digit(b[j]) + c
            c = sum / 2
            sum %= 2
            res[k--] = (sum + '0'.code).toChar()
            i--
            j--
        }

        while (i >= 0) {
            var sum = digit(a[i]) + c
            c = sum / 2
            sum %= 2
            res[k--] = (sum + '0'.code).toChar()
            i--
        }

        while (j >= 0) {
            var sum = digit(b[j]) + c
            c = sum / 2
            sum %= 2
            res[k--] = (sum + '0'.code).toChar()
            j--
        }

        if (c == 1) {
            res[0] = (c + '0'.code).toChar()
        }

        return if (c == 1) {
            String(res)
        } else {
            String(res, 1, res.size - 1)
        }
    }

    private fun digit(c: Char): Int {
        return c - '0'
    }
}