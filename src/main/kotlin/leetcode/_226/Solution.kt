package leetcode._226

import models.TreeNode

class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        invert(root)
        return root
    }

    private fun invert(head: TreeNode?) {
        if (head == null) {
            return
        } else {
            val tempNode = head.right
            head.right = head.left
            head.left = tempNode

            invert(head.left)
            invert(head.right)
        }
    }
}