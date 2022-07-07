package leetcode._938

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

    print("Enter the low value: ")
    val low = scanner.nextInt()

    print("Enter the high value: ")
    val high = scanner.nextInt()

    val root = TreeUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.rangeSumBST(root, low, high)

    println("The range sum of the given Binary Search Tree is: $output")
}