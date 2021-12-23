package leetcode._20

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        var output = true
        val stack = Stack<Char>()

        outer@ for (char in s) {
            when (char) {
                '(', '[', '{' -> {
                    stack.push(char)
                }
                ')', ']', '}' -> {
                    if (stack.isEmpty()) {
                        output = false
                        break@outer
                    }
                    val peek = stack.peek()
                    val expectedMatchingBracket = getMatchingBrackets(char)
                    if (peek == expectedMatchingBracket) {
                        stack.pop()
                    } else {
                        output = false
                        break@outer
                    }
                }
            }
        }

        if (stack.isNotEmpty()) {
            output = false
        }

        return output
    }

    // Will never go to the else condition
    private fun getMatchingBrackets(char: Char) = when (char) {
        ')' -> '('
        ']' -> '['
        '}' -> '{'
        else -> ' '
    }
}