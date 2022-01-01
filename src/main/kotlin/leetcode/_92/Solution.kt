package leetcode._92

import models.ListNode

class Solution {
    fun reverseBetween(head: ListNode?, left: Int, right: Int): ListNode? {
        var current = head
        var prevLeft: ListNode? = null
        var nextRight: ListNode? = null

        var index = 1

        while (index < right) {
            if (index < left) {
                prevLeft = current
            }
            current = current?.next
            index++
        }
        nextRight = current?.next

        // Now let's start with reversing

        current = prevLeft?.next ?: head
        val lastNodeAfterReversal = current

        var prev: ListNode? = null
        var diff = right - left + 1
        index = 0

        while (index < diff) {
            val temp = current?.next
            current?.next = prev
            prev = current
            current = temp
            index++
        }

        // Now let's check which condition this falls in
        val start = if (prevLeft == null) {
            prev
        } else {
            prevLeft.next = prev
            head
        }

        if (nextRight != null) {
            lastNodeAfterReversal?.next = nextRight
        }

        return start
    }
}