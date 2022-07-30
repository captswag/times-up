package leetcode._671

import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the Binary Tree: ")
    val size = scanner.nextInt()

    val nums = Array(size) { 0 }
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val root = TreeUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.findSecondMinimumValue(root)

    println("The second minimum node value is: $output")
}