package leetcode._160

import models.ListNode

class Solution {
    fun getIntersectionNode(headA: ListNode?, headB: ListNode?): ListNode? {
        var output: ListNode? = null

        var nodeA = headA
        var nodeB = headB
        val lengthA = length(nodeA)
        val lengthB = length(nodeB)
        val diff = lengthA - lengthB

        if (diff > 0) {
            // Means nodeA has more nodes, and so we have to increment the nodeA
            var index = 0
            while (index < diff) {
                nodeA = nodeA?.next
                index++
            }
        } else if (diff < 0) {
            // Means nodeB has more nodes, and so we have to increment the nodeB
            var index = 0
            while (index < diff * -1) {
                nodeB = nodeB?.next
                index++
            }
        }

        // Now find the common node

        var currentA = nodeA
        var currentB = nodeB

        while (currentA != null && currentB != null) {
            if (currentA == currentB) {
                output = currentA
                break
            } else {
                currentA = currentA.next
                currentB = currentB.next
            }
        }

        return output
    }

    fun length(head: ListNode?): Int {
        var length = 0

        var current = head

        while (current != null) {
            length++
            current = current.next
        }

        return length
    }
}