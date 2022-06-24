package leetcode._270

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

    print("Enter the target value: ")
    val target = scanner.nextDouble()

    val root = TreeUtils.createFromIntArray(nums)

    val solution = Solution()
    val output = solution.closestValue(root, target)

    println("The closest value to $target in the given Binary Search Tree is: $output")
}