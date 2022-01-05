package leetcode._700

import models.TreeNode

class Solution {
    fun searchBST(root: TreeNode?, `val`: Int): TreeNode? {
        return search(root, `val`)
    }

    private fun search(head: TreeNode?, `val`: Int): TreeNode? {
        return if (head == null) {
            null
        } else if (head.`val` == `val`) {
            head
        } else {
            val search1 = search(head.left, `val`)
            val search2 = search(head.right, `val`)
            search1 ?: search2
        }
    }
}