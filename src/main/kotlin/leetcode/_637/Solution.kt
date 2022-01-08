package leetcode._637

import models.TreeNode
import java.util.*

class Solution {
    fun averageOfLevsls(root: TreeNode?): DoubleArray {
        val output = mutableListOf<Double>()

        if (root != null) {
            val queue = LinkedList<TreeNode?>()
            var sum: Double = 0.0
            var count = 0
            var hasChildNode = false
            queue.add(root)
            queue.add(null)

            while (queue.isNotEmpty()) {
                val node = queue.pop()

                if (node == null) {
                    output.add(sum / count)
                    if (hasChildNode) {
                        queue.add(null)
                    }
                    // Reset everything
                    sum = 0.0
                    count = 0
                    hasChildNode = false
                } else {
                    sum += node.`val`
                    count++
                    val left = node.left
                    val right = node.right
                    if (left != null) {
                        hasChildNode = true
                        queue.add(left)
                    }
                    if (right != null) {
                        hasChildNode = true
                        queue.add(right)
                    }
                }
            }
        }

        return output.toDoubleArray()
    }
}