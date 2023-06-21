package leetcode._2231

import java.util.*

class Solution {

    fun largestInteger(num: Int): Int {
        val evenHeap = PriorityQueue<Int> { a, b -> b - a }
        val oddHeap = PriorityQueue<Int> { a, b -> b - a }
        val stack = Stack<Int>()

        var number = num

        while (number != 0) {
            val mod = number % 10
            if (mod % 2 == 0) {
                evenHeap.add(mod)
            } else {
                oddHeap.add(mod)
            }
            stack.add(mod)
            number /= 10
        }

        var largestInteger = 0
        while (stack.isNotEmpty()) {
            largestInteger *= 10
            val curr = stack.pop()
            largestInteger += if (curr % 2 == 0) {
                evenHeap.remove()
            } else {
                oddHeap.remove()
            }
        }

        return largestInteger
    }
}