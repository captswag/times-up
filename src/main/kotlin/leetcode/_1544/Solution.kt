package leetcode._1544

import java.util.*

class Solution {
    fun makeGood(s: String): String {
        val stack = Stack<Char>()

        for (c in s) {
            if (stack.isEmpty()) {
                stack.push(c)
            } else {
                if (Math.abs(stack.peek() - c) == 32) {
                    stack.pop()
                } else {
                    stack.push(c)
                }
            }
        }

        val output = CharArray(stack.size)
        for (index in stack.size - 1 downTo 0) {
            output[index] = stack.pop()
        }

        return String(output)
    }
}