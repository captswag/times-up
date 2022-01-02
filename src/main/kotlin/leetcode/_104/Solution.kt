package leetcode._104

import models.TreeNode

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        return getDepth(root, 1)
    }

    private fun getDepth(head: TreeNode?, depth: Int): Int {
        return if (head == null) {
            depth - 1
        } else {
            val depth1 = getDepth(head.left, depth + 1)
            val depth2 = getDepth(head.right, depth + 1)
            if (depth1 > depth2) {
                depth1
            } else {
                depth2
            }
        }
    }
}