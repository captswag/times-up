package leetcode._112

import models.TreeNode

class Solution {
    fun hasPathSum(root: TreeNode?, targetSum: Int): Boolean {
        return searchForSum(root, targetSum, 0)
    }

    private fun searchForSum(head: TreeNode?, targetSum: Int, sum: Int): Boolean {
        return if (head == null) {
            false
        } else if (head.left == null && head.right == null) {
            // Leaf node
            sum + head.`val` == targetSum
        } else {
            val sumCheck1 = searchForSum(head.left, targetSum, sum + head.`val`)
            val sumCheck2 = searchForSum(head.right, targetSum, sum + head.`val`)
            return sumCheck1 || sumCheck2
        }
    }
}