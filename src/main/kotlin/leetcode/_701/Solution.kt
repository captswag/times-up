package leetcode._701

import models.TreeNode

class Solution {
    fun insertIntoBST(root: TreeNode?, `val`: Int): TreeNode? {
        return if (root == null) {
            TreeNode(`val`)
        } else {
            var head = root

            while (head != null) {
                if (`val` > head.`val`) {
                    // Go right only if right exists, otherwise insert to the right here
                    if (head.right == null) {
                        head.right = TreeNode(`val`)
                        break
                    } else {
                        head = head.right
                    }
                } else {
                    // Go left only if left exists, otherwise insert to the left here
                    if (head.left == null) {
                        head.left = TreeNode(`val`)
                        break
                    } else {
                        head = head.left
                    }
                }
            }
            root
        }
    }
}