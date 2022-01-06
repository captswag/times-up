package leetcode._707

import models.ListNode

class MyLinkedList {

    var root: ListNode? = null

    fun get(index: Int): Int {
        var head = root
        var i = 0
        while (head != null && i < index) {
            head = head.next
            i++
        }

        return head?.`val` ?: -1
    }

    fun addAtHead(`val`: Int) {
        val head = root
        root = ListNode(`val`, head)
    }

    fun addAtTail(`val`: Int) {
        if (root == null) {
            root = ListNode(`val`)
        } else {
            var head = root
            while (head?.next != null) {
                head = head.next
            }
            head?.next = ListNode(`val`)
        }
    }

    fun addAtIndex(index: Int, `val`: Int) {
        var i = 0

        var prev: ListNode? = null
        var head = root

        if (index == 0) {
            addAtHead(`val`)
        } else {
            while (i < index) {
                prev = head
                head = head?.next
                i++
            }

            if (prev != null) {
                prev.next = ListNode(`val`, head)
            }
        }
    }

    fun deleteAtIndex(index: Int) {
        var i = 0

        var prev: ListNode? = null
        var head = root

        if (index == 0) {
            root = root?.next
        } else {
            while (i < index) {
                prev = head
                head = head?.next
                i++
            }
        }

        if (prev != null) {
            prev.next = head?.next
        }
    }
}