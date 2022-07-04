package leetcode._1469

import models.TreeNode

class Solution {
    fun getLonelyNodes(root: TreeNode?): List<Int> {
        val output = mutableListOf<Int>()
        traverse(root, false, output)
        return output
    }

    private fun traverse(head: TreeNode?, isLonely: Boolean, list: MutableList<Int>) {
        if (head != null) {
            if (isLonely) {
                list.add(head.`val`)
            }
            traverse(head.left, head.right == null, list)
            traverse(head.right, head.left == null, list)
        }
    }
}