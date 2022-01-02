package leetcode._404

import models.TreeNode

class Solution {
    fun sumOfLeftLeaves(root: TreeNode?): Int {
        return traverseAndFindSum(root, false)
    }

    private fun traverseAndFindSum(head: TreeNode?, leftNode: Boolean): Int {
        if (head == null) {
            return 0
        } else if (head.left == null && head.right == null) {
            // This is a leaf node
            return if (leftNode) {
                head.`val`
            } else {
                0
            }
        }
        val sum1 = traverseAndFindSum(head.left, true)
        val sum2 = traverseAndFindSum(head.right, false)
        return sum1 + sum2
    }
}