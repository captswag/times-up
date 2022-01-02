package leetcode._144

import extentions.displayFormatted
import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the Binary Search Tree: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at indexx $index: ")
        nums[index] = scanner.nextInt()
    }

    val root = TreeUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.preorderTraversal(root)

    output.displayFormatted()
}