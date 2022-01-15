package leetcode._543

import models.TreeNode

class Solution {
    private var output = 0

    fun diameterOfBinaryTree(root: TreeNode?): Int {
        traverse(root)
        return output
    }

    private fun traverse(head: TreeNode?): Int {
        return if (head == null) {
            0
        } else {
            val left = traverse(head.left)
            val right = traverse(head.right)
            val diameter = left + right
            if (diameter > output) {
                output = diameter
            }
            Math.max(left, right) + 1
        }
    }
}