package leetcode._112

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

    print("Enter the value of target sum: ")
    val targetSum = scanner.nextInt()

    val solution = Solution()
    val output = solution.hasPathSum(root, targetSum)

    if (output) {
        println("The root-to-leaf path with the target sum is shown")
    } else {
        println("There is no root-to-leaf path with sum = $targetSum")
    }
}