package leetcode._257

import models.TreeNode

class Solution {
    val list = mutableListOf<String>()

    fun binaryTreePath(root: TreeNode?): List<String> {
        traverse(root, "")
        return list
    }

    private fun traverse(head: TreeNode?, path: String) {
        if (head == null) {
            return
        } else if (head.left == null && head.right == null) {
            val newPath = getPath(path, head.`val`)
            list.add(newPath)
        } else {
            val newPath = getPath(path, head.`val`)
            traverse(head.left, newPath)
            traverse(head.right, newPath)
        }
    }

    private fun getPath(path: String, `val`: Int): String {
        return if (path.isEmpty()) {
            "$`val`"
        } else {
            "$path->$`val`"
        }
    }
}