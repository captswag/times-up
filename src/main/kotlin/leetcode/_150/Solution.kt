package leetcode._150

class Solution {

    fun evalRPN(tokens: Array<String>): Int {
        val stk = IntArray(tokens.size)
        var size = 0

        for (s in tokens) {
            if (isDigit(s)) {
                stk[size++] = digit(s)
            } else {
                val b = stk[--size]
                val a = stk[--size]
                when (s[0]) {
                    '+' -> stk[size++] = a + b
                    '-' -> stk[size++] = a - b
                    '*' -> stk[size++] = a * b
                    else -> stk[size++] = a / b
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

        var num = 0
        while (i < s.length) {
            num = (num * 10) + (s[i] - '0')
            i++
        }

        return num * sign
    }
}