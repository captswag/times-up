package utils

import models.ListNode

object LinkedListUtils {
    fun createFromIntArray(nums: IntArray): ListNode? {
        var root: ListNode? = null

        for (num in nums) {
            if (root == null) {
                root = ListNode(num)
            } else {
                var head = root
                while (head?.next != null) {
                    head = head.next
                }
                head?.next = ListNode(num)
            }
        }
        return root
    }
}