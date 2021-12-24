package leetcode._21

import models.ListNode

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        var head1 = list1
        var head2 = list2
        var output: ListNode? = null

        while (head1 != null && head2 != null) {
            if (head1.`val` < head2.`val`) {
                output = addItemsToNode(output, head1.`val`)
                head1 = head1.next
            } else {
                output = addItemsToNode(output, head2.`val`)
                head2 = head2.next
            }
        }
        while (head1 != null) {
            output = addItemsToNode(output, head1.`val`)
            head1 = head1.next
        }
        while (head2 != null) {
            output = addItemsToNode(output, head2.`val`)
            head2 = head2.next
        }
        return output
    }

    private fun addItemsToNode(node: ListNode?, value: Int): ListNode? {
        var root = node
        if (root == null) {
            root = ListNode(value)
        } else {
            var head: ListNode? = root
            while (head?.next != null) {
                head = head.next
            }
            head?.next = ListNode(value)
        }
        return root
    }
}