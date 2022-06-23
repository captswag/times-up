package utils

import models.Node

object NodeUtils {
    fun findNode(root: Node?, value: Int): Node? {
        return traverseAndFind(root, value)
    }

    private fun traverseAndFind(head: Node?, value: Int): Node? {
        return if (head != null) {
            if (head.`val` == value) {
                head
            } else {
                val childNodes = mutableListOf<Node?>()
                for (child in head.children) {
                    childNodes.add(traverseAndFind(child, value))
                }
                var node: Node? = null
                for (child in childNodes) {
                    if (child != null) {
                        node = child
                    }
                }
                node
            }
        } else null
    }
}