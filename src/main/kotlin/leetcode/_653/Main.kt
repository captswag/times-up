package leetcode._653

import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the binary search tree: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val root = TreeUtils.createFromIntArray(nums)

    println("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.findTarget(root, k)

    if (output) {
        println("There exists two elements in the BST with the sum $k")
    } else {
        println("There are no two elements in the BST with the sum $k")
    }
}