package leetcode._783

import models.TreeNode

class Solution {
    val list = mutableListOf<Int>()

    fun minDiffInBST(root: TreeNode?): Int {
        traverse(root)

        var minDiff = list[1] - list[0]
        for (index in 1 until list.size - 1) {
            val currentDiff = list[index + 1] - list[index]
            if (currentDiff < minDiff) {
                minDiff = currentDiff
            }
        }

        return minDiff
    }

    private fun traverse(head: TreeNode?) {
        if (head == null) {
            return
        } else {
            traverse(head.left)
            list.add(head.`val`)
            traverse(head.right)
        }
    }
}