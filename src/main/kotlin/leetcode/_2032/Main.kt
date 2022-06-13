package leetcode._2032

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter size of array 1: ")
    val size1 = scanner.nextInt()

    val nums1 = IntArray(size1)
    for (index in nums1.indices) {
        print("Enter the value at position $index: ")
        nums1[index] = scanner.nextInt()
    }

    print("Enter the size of array 2: ")
    val size2 = scanner.nextInt()

    val nums2 = IntArray(size2)
    for (index in nums2.indices) {
        print("Enter the value at position $index: ")
        nums2[index] = scanner.nextInt()
    }

    print("Enter the size of array 3: ")
    val size3 = scanner.nextInt()

    val nums3 = IntArray(size3)
    for (index in nums3.indices) {
        print("Enter the value at position $index: ")
        nums3[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.twoOutOfThree(nums1, nums2, nums3)

    output.displayFormatted()
}