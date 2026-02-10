package refresh._20

import java.util.*

class Solution {

    fun isValid(s: String): Boolean {
        val stk = Stack<Char>()

        for (c in s) {
            if (stk.isEmpty() || c == '(' || c == '{' || c == '[' || stk.peek() != getOpeningParentheses(c)) {
                stk.push(c)
            } else {
                stk.pop()
            }
        }

        return stk.isEmpty()
    }

    private fun getOpeningParentheses(c: Char): Char {
        return when (c) {
            ')' -> {
                '('
            }
            '}' -> {
                '{'
            }
            else -> {
                '['
            }
        }
    }
}