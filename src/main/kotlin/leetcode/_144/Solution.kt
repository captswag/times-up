package leetcode._144

import models.TreeNode

class Solution {
    private val list = mutableListOf<Int>()

    fun preorderTraversal(root: TreeNode?): List<Int> {
        traverse(root)
        return list
    }

    private fun traverse(head: TreeNode?) {
        if (head == null) {
            return
        } else {
            list.add(head.`val`)
            traverse(head.left)
            traverse(head.right)
        }
    }
}