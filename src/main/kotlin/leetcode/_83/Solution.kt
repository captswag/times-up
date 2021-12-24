package leetcode._83

import models.ListNode

class Solution {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var searchDigit: Int? = null
        var pointer = head
        var prev: ListNode? = null

        while (pointer != null) {
            if (searchDigit == null) {
                searchDigit = pointer.`val`
                prev = pointer
                pointer = pointer.next
            } else {
                if (searchDigit == pointer.`val`) {
                    pointer = pointer.next
                    prev?.next = pointer
                } else {
                    searchDigit = pointer.`val`
                    prev = pointer
                    pointer = pointer.next
                }
            }
        }
        return head
    }
}