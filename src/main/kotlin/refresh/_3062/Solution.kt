package refresh._3062

import models.ListNode

class Solution {

    fun gameResult(head: ListNode?): String {
        var even = 0
        var odd = 0
        var cur: ListNode? = head

        while (cur != null) {
            if (cur.`val` > cur.next!!.`val`) {
                even++
            } else {
                odd++
            }
            cur = cur.next?.next
        }

        return if (odd == even) {
            "Tie"
        } else if (odd > even) {
            "Odd"
        } else {
            "Even"
        }
    }
}