package leetcode._653

import models.TreeNode
import java.util.*

class Solution {
    fun findTarget(root: TreeNode?, k: Int): Boolean {
        val set = mutableSetOf<Int>()
        val queue: Queue<TreeNode> = LinkedList()
        var output = false

        if (root != null) {
            queue.add(root)

            // Now start the whole looping process
            while (queue.isNotEmpty()) {
                val node = queue.remove()
                if (set.contains(node.`val`)) {
                    // We found the pair
                    output = true
                    break
                } else {
                    set.add(k - node.`val`)
                    // Go left and go right
                    val left = node.left
                    if (left != null) {
                        queue.add(left)
                    }
                    val right = node.right
                    if (right != null) {
                        queue.add(right)
                    }
                }
            }
        }

        return output
    }
}