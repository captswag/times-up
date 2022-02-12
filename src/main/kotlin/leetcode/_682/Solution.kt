package leetcode._682

import java.util.*

class Solution {
    fun calPoints(ops: Array<String>): Int {
        val stack = Stack<Int>()

        for (op in ops) {
            val opDigit = op.toIntOrNull()
            if (opDigit != null) {
                stack.push(opDigit.toInt())
            } else if (op.equals("C")) {
                stack.pop()
            } else if (op.equals("D")) {
                val top = stack.peek()
                stack.push(top * 2)
            } else if (op.equals("+")) {
                val pop = stack.pop()
                val top = stack.peek()
                stack.push(pop)
                stack.push(pop + top)
            }
        }

        var output = 0
        while (stack.isNotEmpty()) {
            output += stack.pop()
        }

        return output
    }
}