package extentions

import models.TreeNode

fun TreeNode.displayFormatted() {
    traverseAndPrint(this, true)
    println()
}

// index is used to print ',' for pretty printing
private fun traverseAndPrint(head: TreeNode?, rootNode: Boolean) {
    if (head == null) {
        return
    } else {
        if (rootNode) {
            print(head.`val`)
        } else {
            print(", ${head.`val`}")
        }
        traverseAndPrint(head.left, false)
        traverseAndPrint(head.right, false)
    }
}