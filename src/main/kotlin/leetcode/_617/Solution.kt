package leetcode._617

import models.TreeNode

class Solution {
    fun mergeTrees(root1: TreeNode?, root2: TreeNode?): TreeNode? {
        return if (root1 == null && root2 != null) {
            TreeNode(root2.`val`)
        } else {
            traverse(null, root1, root2, 0)
            // -1 means left, 0 means root and 1 means right
            root1
        }
    }

    private fun traverse(parent: TreeNode?, head1: TreeNode?, head2: TreeNode?, direction: Int) {
        if (head1 != null || head2 != null) {
            if (head1 != null && head2 != null) {
                head1.`val` = head1.`val` + head2.`val`
                traverse(head1, head1.left, head2.left, -1)
                traverse(head1, head1.right, head2.right, 1)
            } else if (head2 != null) {
                if (parent != null) {
                    val node = TreeNode(head2.`val`)
                    if (direction == -1) {
                        parent.left = node
                    } else {
                        parent.right = node
                    }
                    traverse(node, node.left, head2.left, -1)
                    traverse(node, node.right, head2.right, 1)
                }
            }
        }
    }
}