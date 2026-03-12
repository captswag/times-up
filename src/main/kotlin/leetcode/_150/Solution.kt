package leetcode._150

class Solution {

    fun evalRPN(tokens: Array<String>): Int {
        val stk = IntArray(tokens.size)
        var sz = 0

        for (s in tokens) {
            if (isDigit(s)) {
                stk[sz++] = digit(s)
            } else {
                val b = stk[--sz]
                val a = stk[--sz]
                when (s[0]) {
                    '+' -> stk[sz++] = a + b
                    '-' -> stk[sz++] = a - b
                    '*' -> stk[sz++] = a * b
                    else -> stk[sz++] = a / b
                }
            }
        }

        return stk[0]
    }

    private fun isDigit(s: String): Boolean {
        return s[s.length - 1].isDigit()
    }

    private fun digit(s: String): Int {
        var i: Int
        val sign: Int

        if (s[0] == '-') {
            i = 1
            sign = -1
        } else {
            i = 0
            sign = 1
        }

        var res = 0
        while (i < s.length) {
            res = (res * 10) + (s[i] - '0')
            i++
        }

        return res * sign
    }
}