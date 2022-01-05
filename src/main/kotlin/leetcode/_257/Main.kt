package leetcode._257

import extentions.displayFormatted
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

    val solution = Solution()
    val output = solution.binaryTreePath(root)

    output.displayFormatted()
}