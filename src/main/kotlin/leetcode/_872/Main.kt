package leetcode._872

import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first Binary Tree: ")
    val size1 = scanner.nextInt()

    val nums1 = IntArray(size1)
    for (index in nums1.indices) {
        print("Enter the value at index $index: ")
        nums1[index] = scanner.nextInt()
    }

    print("Enter the size of the second Binary Tree: ")
    val size2 = scanner.nextInt()

    val nums2 = IntArray(size2)
    for (index in nums2.indices) {
        print("Enter the value at index $index: ")
        nums2[index] = scanner.nextInt()
    }

    val root1 = TreeUtils.createFromIntArray(nums1)
    val root2 = TreeUtils.createFromIntArray(nums2)

    val solution = Solution()
    val output = solution.leafSimilar(root1, root2)

    if (output) {
        println("The two trees are leaf-similar")
    } else {
        println("The two trees are not leaf-similar")
    }
}