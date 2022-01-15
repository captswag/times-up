package leetcode._496

import java.util.*

class Solution {
    fun nextGreaterElement(nums1: IntArray, nums2: IntArray): IntArray {
        val output = IntArray(nums1.size)

        val stack = Stack<Int>()
        val map = mutableMapOf<Int, Int>()

        var index = 0
        while (index < nums2.size) {
            if (stack.isEmpty()) {
                stack.push(nums2[index])
                index++
            } else {
                if (nums2[index] < stack.peek()) {
                    stack.push(nums2[index])
                    index++
                } else {
                    // Now the num is greater than stack.peek()
                    map[stack.pop()] = nums2[index]
                }
            }
        }

        while (stack.isNotEmpty()) {
            map[stack.pop()] = -1
        }

        index = 0
        while (index < nums1.size) {
            output[index] = map[nums1[index]] ?: -1
            index++
        }

        return output
    }
}