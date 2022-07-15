package leetcode._2331

import models.TreeNode
import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    println("Enter the value of the root node: ")
    val rootNodeValue = scanner.nextInt()

    val root = TreeNode(rootNodeValue)
    var loop = true

    while (loop) {
        print("1. Insert\n2. Continue\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the value of the parent node: ")
                val parentNodeValue = scanner.nextInt()
                val parentNode = TreeUtils.findNodeLast(root, parentNodeValue)
                print("Enter the value to be inserted: ")
                val childNode = TreeNode(scanner.nextInt())

                if (parentNode != null) {
                    if (parentNode.left != null) {
                        parentNode.left = childNode
                    } else {
                        parentNode.right = childNode
                    }
                }
            }
            2 -> {
                loop = false
            }
        }
    }

    val solution = Solution()
    val output = solution.evaluateTree(root)

    println("The output after evaluating the Binary Tree is: $output")
}