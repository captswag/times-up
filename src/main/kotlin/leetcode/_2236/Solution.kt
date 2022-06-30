package leetcode._2236

import models.TreeNode

class Solution {
    fun checkTree(root: TreeNode?): Boolean {
        val left = root?.left
        val right = root?.right

        return if (left != null && right != null) {
            root.`val` == left.`val` + right.`val`
        } else {
            false
        }
    }
}