package leetcode._111

import models.TreeNode

class Solution {
    fun minDepth(root: TreeNode?): Int {
        return getDepth(root, 1)
    }

    private fun getDepth(head: TreeNode?, depth: Int): Int {
        return if (head == null) {
            depth - 1
        } else {
            if (head.left == null || head.right == null) {
                return if (head.left == null) {
                    getDepth(head.right, depth + 1)
                } else {
                    getDepth(head.left, depth + 1)
                }
            } else {
                val depth1 = getDepth(head.left, depth + 1)
                val depth2 = getDepth(head.right, depth + 1)
                Math.min(depth1, depth2)
            }
        }
    }
}