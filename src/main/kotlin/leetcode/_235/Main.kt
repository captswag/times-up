package leetcode._235

import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the Binary Search Tree: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val root = TreeUtils.createFromIntArray(nums)

    print("Enter the value of p: ")
    val pValue = scanner.nextInt()
    val p = TreeUtils.findNode(root, pValue)

    print("Enter the value of q: ")
    val qValue = scanner.nextInt()
    val q = TreeUtils.findNode(root, qValue)

    val solution = Solution()
    val output = solution.lowestCommonAncestor(root, p, q)

    println("The lowest common ancestor node is: ${output?.`val`}")
}