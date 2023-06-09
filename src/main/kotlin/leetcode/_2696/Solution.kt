package leetcode._2696

import java.util.*

class Solution {

    fun minLength(s: String): Int {
        val stack = Stack<Char>()

        for (c in s) {
            if (c == 'B' && stack.isNotEmpty() && stack.peek() == 'A') {
                stack.pop()
            } else if (c == 'D' && stack.isNotEmpty() && stack.peek() == 'C') {
                stack.pop()
            } else {
                stack.push(c)
            }
        }

        return stack.size
    }
}