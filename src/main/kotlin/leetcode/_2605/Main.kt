package leetcode._2605

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of array 1: ")
    val size1 = scanner.nextInt()

    val nums1 = IntArray(size1)
    for (index in nums1.indices) {
        print("Enter the value at index $index: ")
        nums1[index] = scanner.nextInt()
    }

    print("Enter the size of array 2: ")
    val size2 = scanner.nextInt()

    val nums2 = IntArray(size2)
    for (index in nums2.indices) {
        print("Enter the value at index $index: ")
        nums2[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.minNumber(nums1, nums2)

    println("The smallest number which can be formed is: $output")
}