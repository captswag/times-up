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

    fun createFromIntArray(nums: Array<Int>): TreeNode? {
        return if (nums.isNotEmpty()) {
            var index = 0
            val currentValue = nums[index++]

            val root = TreeNode(currentValue)
            val queue: Queue<TreeNode> = LinkedList()
            queue.offer(root)
            while (queue.isNotEmpty()) {
                val current = queue.poll()
                val diff = nums.size - index
                if (diff >= 1) {
                    val left = TreeNode(nums[index++])
                    current.left = left
                    queue.add(left)
                    if (diff >= 2) {
                        val right = TreeNode(nums[index++])
                        current.right = right
                        queue.add(right)
                    }
                } else {
                    break
                }
            }
            root
        } else {
            null
        }
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