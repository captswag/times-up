package leetcode._3063

import models.ListNode

class Solution {

    fun frequenciesOfElements(head: ListNode?): ListNode? {
        val frequency = mutableMapOf<Int, Int>()
        var current = head

        while (current != null) {
            frequency[current.`val`] = frequency.getOrDefault(current.`val`, 0) + 1
            current = current.next
        }

        val freqHead = ListNode(0, null)
        current = freqHead
        for (value in frequency.values) {
            current?.next = ListNode(value)
            current = current?.next
        }

        return freqHead.next
    }
}