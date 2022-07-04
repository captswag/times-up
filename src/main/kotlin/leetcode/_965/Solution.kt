package leetcode._965

import models.TreeNode

class Solution {
    fun isUnivalTree(root: TreeNode?): Boolean {
        return if (root == null) {
            true
        } else {
            traverse(root, root.`val`)
        }
    }

    private fun traverse(head: TreeNode?, parentVal: Int): Boolean {
        return if (head == null) {
            true
        } else {
            if (head.`val` != parentVal) {
                false
            } else {
                val left = traverse(head.left, head.`val`)
                val right = traverse(head.right, head.`val`)
                left && right
            }
        }
    }
}