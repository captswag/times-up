package leetcode._589

import extentions.displayFormatted
import models.Node
import utils.NodeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of the root node: ")
    val rootNodeValue = scanner.nextInt()

    val root = Node(rootNodeValue)
    var loop = true

    while (loop) {
        print("1. Insert\n2. Continue\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the value of the parent node: ")
                val parentNodeValue = scanner.nextInt()
                val parentNode = NodeUtils.findNode(root, parentNodeValue)

                print("Enter the number of child nodes: ")
                val count = scanner.nextInt()
                val childNodes = mutableListOf<Node>()
                for (index in 0 until count) {
                    print("Enter the value of the node at index $index: ")
                    childNodes.add(Node(scanner.nextInt()))
                }

                parentNode?.children = childNodes
            }
            2 -> {
                loop = false
            }
        }
    }

    val solution = Solution()
    val output = solution.preorder(root)

    output.displayFormatted()
}