package leetcode._617

import extentions.displayFormatted
import utils.TreeUtils
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter size of first Binary Tree: ")
    val size1 = scanner.nextInt()

    val nums1 = IntArray(size1)
    for (index in nums1.indices) {
        print("Enter the value at index $index: ")
        nums1[index] = scanner.nextInt()
    }

    print("Enter size of second Binary Tree: ")
    val size2 = scanner.nextInt()

    val nums2 = IntArray(size2)
    for (index in nums2.indices) {
        print("Enter the value at index $index: ")
        nums2[index] = scanner.nextInt()
    }

    val root1 = TreeUtils.createFromIntArray(nums1)
    val root2 = TreeUtils.createFromIntArray(nums2)

    val solution = Solution()
    val output = solution.mergeTrees(root1, root2)

    output?.displayFormatted()
}