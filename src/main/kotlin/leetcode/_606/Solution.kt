package leetcode._606

import models.TreeNode

class Solution {
    fun tree2str(root: TreeNode?): String {
        val output = StringBuilder()
        traverse(root, false, output)
        return String(output)
    }

    private fun traverse(head: TreeNode?, hasParent: Boolean, stringBuilder: StringBuilder) {
        if (head != null) {
            if (hasParent) {
                stringBuilder.append('(')
            }
            stringBuilder.append(head.`val`)
            // Don't reach the null node
            if (head.left != null) {
                traverse(head.left, true, stringBuilder)
                stringBuilder.append(')')
            } else {
                if (head.right != null) {
                    stringBuilder.append('(')
                    stringBuilder.append(')')
                }
            }
            if (head.right != null) {
                traverse(head.right, true, stringBuilder)
                stringBuilder.append(')')
            }
        }
    }
}