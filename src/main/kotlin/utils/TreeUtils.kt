package utils

import models.TreeNode
import java.util.*

object TreeUtils {
    fun createFromIntArray(nums: IntArray): TreeNode? {
        var root: TreeNode? = null

        for (num in nums) {
            if (root == null) {
                root = TreeNode(num)
            } else {
                var head = root

                while (head != null) {
                    if (num < head.`val`) {
                        // Go left
                        if (head.left != null) {
                            head = head.left
                        } else {
                            head.left = TreeNode(num)
                            break
                        }
                    } else {
                        // Go right
                        if (head.right != null) {
                            head = head.right
                        } else {
                            head.right = TreeNode(num)
                            break
                        }
                    }
                }
            }
        }
        return root
    }

    fun findNode(root: TreeNode?, value: Int): TreeNode? {
        var head = root
        var node: TreeNode? = null

        while (head != null) {
            if (head.`val` == value) {
                node = head
                break
            } else if (value < head.`val`) {
                head = head.left
            } else {
                head = head.right
            }
        }

        return node
    }

    fun findNodeLast(root: TreeNode?, value: Int): TreeNode? {
        var node: TreeNode? = null

        val queue: Deque<TreeNode> = LinkedList()
        queue.add(root)

        while (queue.isNotEmpty()) {
            val head = queue.remove()
            if (head.`val` == value) {
                node = head
            }
            val left = head.left
            if (left != null) {
                queue.add(left)
            }
            val right = head.right
            if (right != null) {
                queue.add(right)
            }
        }

        return node
    }
}