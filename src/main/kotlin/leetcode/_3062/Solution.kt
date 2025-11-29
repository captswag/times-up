package leetcode._3062

import models.ListNode

class Solution {

    fun gameResult(head: ListNode?): String {
        var current = head
        var even = 0
        var odd = 0

        while (current != null) {
            val evenValue = current.`val`
            if (current.next != null) {
                current = current.next
                val oddValue = current?.`val`
                if (oddValue != null) {
                    if (evenValue > oddValue) {
                        even++
                    } else if (oddValue > evenValue) {
                        odd++
                    }
                }
                current = current?.next
            }
        }

        return if (even == odd) {
            "Tie"
        } else if (even > odd) {
            "Even"
        } else {
            "Odd"
        }
    }
}