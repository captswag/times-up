package leetcode._2236

import models.TreeNode
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of the root node: ")
    val root = TreeNode(scanner.nextInt())

    print("Enter the value of the left node: ")
    val left = TreeNode(scanner.nextInt())

    print("Enter the value of the right node: ")
    val right = TreeNode(scanner.nextInt())

    root.left = left
    root.right = right

    val solution = Solution()
    val output = solution.checkTree(root)

    if (output) {
        println("Root equals sum of children")
    } else {
        println("Root doesn't equal sum of children")
    }
}