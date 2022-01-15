package leetcode._496

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the first array: ")
    val size1 = scanner.nextInt()

    val nums1 = IntArray(size1)
    for (index in nums1.indices) {
        print("Enter the value at index $index: ")
        nums1[index] = scanner.nextInt()
    }

    print("Enter the size of the second array: ")
    val size2 = scanner.nextInt()

    val nums2 = IntArray(size2)
    for (index in nums2.indices) {
        print("Enter the value at index $index: ")
        nums2[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.nextGreaterElement(nums1, nums2)

    output.displayFormatted()
}