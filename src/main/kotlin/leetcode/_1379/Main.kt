package leetcode._1379

import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the Binary Tree: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    print("Enter target node value: ")
    val targetValue = scanner.nextInt()

    val original = TreeUtils.createFromIntArray(nums)
    val cloned = TreeUtils.createFromIntArray(nums)
    val target = TreeUtils.findNodeLast(original, targetValue)

    val solution = Solution()
    val output = solution.getTargetCopy(original, cloned, target)

    println("Corresponding node value in the cloned Binary Tree is: ${output.`val`}")
}