package extentions

import models.ListNode

fun ListNode.displayFormatted() {
    var index = 0
    var head: ListNode? = this

    while (head != null) {
        if (index == 0) {
            print(head.`val`)
        } else {
            print(", ${head.`val`}")
        }
        index++
        head = head.next
    }
    println()
}