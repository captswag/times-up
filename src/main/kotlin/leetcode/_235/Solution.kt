package leetcode._235

import models.TreeNode

class Solution {
    fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
        var head = root
        val set = mutableSetOf<TreeNode>()
        var output: TreeNode? = null

        while (head != null && p != null) {
            head = if (head.`val` == p.`val`) {
                // Add to the set
                set.add(head)
                break
            } else if (p.`val` < head.`val`) {
                set.add(head)
                head.left
            } else {
                set.add(head)
                head.right
            }
        }

        head = root

        while (head != null && q != null) {
            if (head.`val` == q.`val`) {
                if (set.contains(head)) {
                    output = head
                }
                break
            } else if (q.`val` < head.`val`) {
                if (set.contains(head)) {
                    output = head
                }
                head = head.left
            } else {
                if (set.contains(head)) {
                    output = head
                }
                head = head.right
            }
        }

        return output
    }
}