package leetcode._589

import models.Node

class Solution {
    fun preorder(root: Node?): List<Int> {
        val output = mutableListOf<Int>()
        traverse(root, output)
        return output
    }

    private fun traverse(head: Node?, list: MutableList<Int>) {
        if (head != null) {
            list.add(head.`val`)
            for (child in head.children) {
                traverse(child, list)
            }
        }
    }
}