package leetcode._876

import models.ListNode

class Solution {
    fun middleNode(head: ListNode?): ListNode? {
        var fast = head
        var slow = head

        while (fast != null) {
            if (fast.next != null) {
                slow = slow?.next
            }
            fast = fast.next?.next
        }

        return slow
    }
}