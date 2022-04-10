package leetcode._1669

import models.ListNode

class Solution {
    fun mergeInBetween(list1: ListNode?, a: Int, b: Int, list2: ListNode?): ListNode? {
        var index = 0
        var prev: ListNode? = null
        var current = list1

        while (index < a) {
            prev = current
            current = current?.next
            index++
        }

        // Now we got the prev value

        while (index < b) {
            current = current?.next
            index++
        }

        val next = current?.next

        current = list2
        while (current?.next != null) {
            current = current.next
        }

        current?.next = next

        return if (prev == null) {
            prev = list2
            prev
        } else {
            prev.next = list2
            list1
        }
    }
}