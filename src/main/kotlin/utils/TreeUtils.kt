package utils

import models.TreeNode

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
}