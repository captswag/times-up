package leetcode._2

import models.ListNode

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        var node1 = l1
        var node2 = l2

        var outputNode: ListNode? = null
        var carryForward = 0

        while (node1 != null || node2 != null) {
            /**
             * Either one of the LinkedList should not be empty for this process to go on
             * Now find the sum and remember the carryForward if any, carryForward will be always 1
             * since the digits are single digit.
             */
            val value1 = node1?.`val` ?: 0
            val value2 = node2?.`val` ?: 0
            val sum = value1 + value2 + carryForward

            val sumAfterModulo = sum % 10
            carryForward = if (sum >= 10) {
                1
            } else 0

            outputNode = addItemsToNode(outputNode, sumAfterModulo)

            node1 = node1?.next
            node2 = node2?.next
        }

        if (carryForward == 1) {
            outputNode = addItemsToNode(outputNode, 1)
            carryForward = 0
        }

        return outputNode
    }

    // I believe Kotlin objects are pass by reference
    private fun addItemsToNode(node: ListNode?, value: Int): ListNode {
        var root = node
        if (root == null) {
            root = ListNode(value)
        } else {
            var head = root
            while (head?.next != null) {
                head = head.next
            }
            head?.next = ListNode(value)
        }
        return root
    }
}