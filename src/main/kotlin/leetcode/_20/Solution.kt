package leetcode._20

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        val map = mutableMapOf(')' to '(', '}' to '{', ']' to '[')

        for (c in s) {
            if (stack.isEmpty()) {
                stack.push(c)
            } else if (map.containsKey(c) && stack.peek() == map.getValue(c)) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }

        return stack.isEmpty()
    }
}