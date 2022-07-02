package leetcode._1290

import models.ListNode

class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var output = 0
        var node = head

        while (node != null) {
            output = output * 2 + node.`val`
            node = node.next
        }

        return output
    }
}