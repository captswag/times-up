package leetcode._203

import models.ListNode

class Solution {
    fun removeElements(head: ListNode?, `val`: Int): ListNode? {
        var root = head

        if (root != null) {
            while (root?.`val` == `val`) {
                root = root.next
            }
        }

        var head = root
        var prev: ListNode? = null

        while (head != null) {
            prev = head
            head = head.next
            if (head?.`val` == `val`) {
                prev.next = head.next
                head = prev
            }
        }
        return root
    }
}