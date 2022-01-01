package leetcode._234

import models.ListNode

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        var current = head
        val half = length(head) / 2
        var prev: ListNode? = null

        for (index in 0 until half) {
            prev = current
            current = current?.next
        }

        // So now we're at the right index to start reversing
        prev?.next = null
        prev = null

        while (current != null) {
            val temp = current.next
            current.next = prev
            prev = current
            current = temp
        }

        // Check if palindrome
        return isPalindrome(head, prev)
    }

    private fun length(head: ListNode?): Int {
        var length = 0
        var current: ListNode? = head

        while (current != null) {
            length++
            current = current.next
        }

        return length
    }

    private fun isPalindrome(head1: ListNode?, head2: ListNode?): Boolean {
        var current1 = head1
        var current2 = head2
        var isPalindrome = true

        while (current1 != null && current2 != null) {
            if (current1.`val` != current2.`val`) {
                isPalindrome = false
                break
            }
            current1 = current1.next
            current2 = current2.next
        }

        return isPalindrome
    }
}