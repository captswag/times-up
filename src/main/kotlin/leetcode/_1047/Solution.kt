package leetcode._1047

import java.util.*

class Solution {
    fun removeDuplicates(s: String): String {
        val stack = Stack<Char>()

        for (c in s) {
            if (stack.isEmpty()) {
                stack.push(c)
            } else {
                if (c == stack.peek()) {
                    stack.pop()
                } else {
                    stack.push(c)
                }
            }
        }

        val output = CharArray(stack.size)
        var lastIndex = output.size - 1
        while (stack.isNotEmpty()) {
            output[lastIndex] = stack.pop()
            lastIndex--
        }

        return String(output)
    }
}