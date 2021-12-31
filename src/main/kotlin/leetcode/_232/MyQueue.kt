package leetcode._232

import java.util.*

class MyQueue {
    private val stack = Stack<Int>()
    private val tempStack = Stack<Int>()

    fun push(x: Int) {
        transferStack(stack, tempStack)
        stack.push(x)
        transferStack(tempStack, stack)
    }

    fun pop(): Int {
        return stack.pop()
    }

    fun peek(): Int {
        return stack.peek()
    }

    fun empty(): Boolean {
        return stack.isEmpty()
    }

    private fun transferStack(stack1: Stack<Int>, stack2: Stack<Int>) {
        while (stack1.isNotEmpty()) {
            stack2.push(stack1.pop())
        }
    }
}