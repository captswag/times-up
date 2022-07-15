package leetcode._2331

import models.TreeNode

class Solution {
    fun evaluateTree(root: TreeNode?): Boolean {
        return evaluate(root) != 0
    }

    private fun evaluate(head: TreeNode?): Int {
        return if (head == null) {
            4 // Value 4 means ignore this value
        } else {
            if (head.left == null && head.right == null) {
                head.`val`
            } else {
                val left = evaluate(head.left)
                val right = evaluate(head.right)

                if (left == 4) {
                    right
                } else if (right == 4) {
                    left
                } else {
                    if (head.`val` == 2) {
                        left or right
                    } else {
                        left and right
                    }
                }
            }
        }
    }
}