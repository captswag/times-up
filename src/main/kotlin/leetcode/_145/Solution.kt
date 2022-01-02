package leetcode._145

import models.TreeNode

class Solution {
    private val list = mutableListOf<Int>()

    fun postOrderTraversal(root: TreeNode?): List<Int> {
        traverse(root)
        return list
    }

    private fun traverse(head: TreeNode?) {
        if (head == null) {
            return
        } else {
            traverse(head.left)
            traverse(head.right)
            list.add(head.`val`)
        }
    }
}