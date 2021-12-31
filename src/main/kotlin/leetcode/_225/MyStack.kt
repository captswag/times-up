package leetcode._225

import java.util.*

class MyStack {
    private val queue: Queue<Int> = LinkedList()
    private val tempQueue: Queue<Int> = LinkedList()

    fun push(x: Int) {
        transferQueue(queue, tempQueue)
        queue.add(x)
        transferQueue(tempQueue, queue)
    }

    fun pop(): Int {
        return queue.remove()
    }

    fun top(): Int {
        return queue.peek()
    }

    fun empty(): Boolean {
        return queue.isEmpty()
    }

    private fun transferQueue(queue1: Queue<Int>, queue2: Queue<Int>) {
        while (queue1.isNotEmpty()) {
            queue2.add(queue1.remove())
        }
    }
}