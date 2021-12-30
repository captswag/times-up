package leetcode._155

import java.util.*

class MinStack {

    private val stack = Stack<Int>()
    private val minStack = Stack<Int>()

    fun push(`val`: Int) {
        try {
            val top = minStack.peek()

            stack.push(`val`)
            if (`val` < top) {
                minStack.push(`val`)
            } else {
                minStack.push(top)
            }
        } catch (exception: EmptyStackException) {
            stack.push(`val`)
            minStack.push(`val`)
        }
    }

    fun pop() {
        stack.pop()
        minStack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun getMin(): Int {
        return minStack.peek()
    }
}