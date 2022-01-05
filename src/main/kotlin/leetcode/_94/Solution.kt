package leetcode._94

import models.TreeNode

class Solution {
    val list = mutableListOf<Int>()

    fun inorderTraversal(root: TreeNode?): List<Int> {
        traverse(root)
        return list
    }

    private fun traverse(head: TreeNode?) {
        if (head == null) {
            return
        } else {
            traverse(head.left)
            list.add(head.`val`)
            traverse(head.right)
        }
    }
}