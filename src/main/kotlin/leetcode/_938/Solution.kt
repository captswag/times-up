package leetcode._938

import models.TreeNode

class Solution {
    fun rangeSumBST(root: TreeNode?, low: Int, high: Int): Int {
        return if (root == null) {
            0
        } else {
            val current = if (root.`val` in low..high) {
                root.`val`
            } else {
                0
            }
            val left = rangeSumBST(root.left, low, high)
            val right = rangeSumBST(root.right, low, high)
            current + left + right
        }
    }
}