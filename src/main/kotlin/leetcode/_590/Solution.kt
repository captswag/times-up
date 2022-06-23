package leetcode._590

import models.Node

class Solution {
    fun postorder(root: Node?): List<Int> {
        val output = mutableListOf<Int>()
        traverse(root, output)
        return output
    }

    private fun traverse(head: Node?, list: MutableList<Int>) {
        if (head != null) {
            for (child in head.children) {
                traverse(child, list)
            }
            list.add(head.`val`)
        }
    }
}