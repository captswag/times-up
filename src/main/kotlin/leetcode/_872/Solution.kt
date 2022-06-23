package leetcode._872

import models.TreeNode

class Solution {
    fun leafSimilar(root1: TreeNode?, root2: TreeNode?): Boolean {
        val list1 = mutableListOf<Int>()
        val list2 = mutableListOf<Int>()
        traverse(root1, list1)
        traverse(root2, list2)

        return if (list1.size == list2.size) {
            var output = true
            var index = 0
            while (index < list1.size) {
                if (list1[index] != list2[index]) {
                    output = false
                    break
                }
                index++
            }
            output
        } else {
            false
        }
    }

    private fun traverse(head: TreeNode?, list: MutableList<Int>) {
        if (head != null) {
            if (head.left == null && head.right == null) {
                // This is the leaf node
                list.add(head.`val`)
            } else {
                traverse(head.left, list)
                traverse(head.right, list)
            }
        }
    }
}