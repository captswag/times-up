package leetcode._671

import models.TreeNode

class Solution {
    fun findSecondMinimumValue(root: TreeNode?): Int {
        return if (root == null) {
            -1
        } else {
            val secondMin = traverse(root, root.`val`)
            if (secondMin == root.`val`) {
                -1
            } else {
                secondMin
            }
        }
    }

    private fun traverse(head: TreeNode, original: Int): Int {
        val left = head.left
        val right = head.right
        return if (left != null && right != null) {
            val leftValue = traverse(left, original)
            val rightValue = traverse(right, original)
            if (leftValue == original || rightValue == original) {
                Math.max(leftValue, rightValue)
            } else {
                Math.min(leftValue, rightValue)
            }
        } else {
            head.`val`
        }
    }
}