package leetcode._559

import models.Node

class Solution {
    fun maxDepth(root: Node?): Int {
        return getDepth(root, 1)
    }

    private fun getDepth(head: Node?, depth: Int): Int {
        return if (head == null) {
            depth - 1
        } else if (head.children.isEmpty()) {
            depth
        } else {
            var maxDepth = -1
            for (child in head.children) {
                val depth = getDepth(child, depth + 1)
                if (depth > maxDepth) {
                    maxDepth = depth
                }
            }
            maxDepth
        }
    }
}