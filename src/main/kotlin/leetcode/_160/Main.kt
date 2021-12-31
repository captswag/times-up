package leetcode._160

import models.ListNode
import utils.LinkedListUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first LinkedList: ")
    val size1 = scanner.nextInt()

    val array1 = IntArray(size1)
    for (index in array1.indices) {
        print("Enter the value at index $index: ")
        array1[index] = scanner.nextInt()
    }
    val headA = LinkedListUtils.createFromIntArray(array1)

    print("Enter the size of the second LinkedList: ")
    val size2 = scanner.nextInt()

    val array2 = IntArray(size2)
    for (index in array2.indices) {
        print("Enter the value at index $index: ")
        array2[index] = scanner.nextInt()
    }
    val headB = LinkedListUtils.createFromIntArray(array2)

    print("Enter the size of the common LinkedList: ")
    val sizeC = scanner.nextInt()

    val arrayC = IntArray(sizeC)
    for (index in arrayC.indices) {
        print("Enter the value at index $index: ")
        arrayC[index] = scanner.nextInt()
    }
    val headC = LinkedListUtils.createFromIntArray(arrayC)

    // Now join them from here.
    joinLinkedLists(headA, headC)
    joinLinkedLists(headB, headC)

    val solution = Solution()
    val output = solution.getIntersectionNode(headA, headB)

    if (output == null) {
        println("There is no node which intersects")
    } else {
        println("The node of intersection is: ${output.`val`}")
    }
}

fun joinLinkedLists(head: ListNode?, headC: ListNode?) {
    var current: ListNode? = head

    while (current?.next != null) {
        current = current.next
    }

    current?.next = headC
}