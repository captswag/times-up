package leetcode._1299

import java.util.*

class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        val stack = Stack<Int>()

        for (index in 1 until arr.size) {
            var count = 0
            while (stack.isNotEmpty() && arr[index] > stack.peek()) {
                stack.pop()
                count++
            }

            while (count > 0) {
                stack.push(arr[index])
                count--
            }
            stack.push(arr[index])
        }

        stack.push(-1)

        var reverseIndex = arr.size - 1
        while (stack.isNotEmpty()) {
            arr[reverseIndex] = stack.pop()
            reverseIndex--
        }

        return arr
    }
}