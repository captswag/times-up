package leetcode._3162

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray 1: ")
    val size1 = scanner.nextInt()

    val nums1 = IntArray(size1)
    for (index in nums1.indices) {
        print("Enter the value at index $index: ")
        nums1[index] = scanner.nextInt()
    }

    print("Enter the size of the IntArray 2: ")
    val size2 = scanner.nextInt()

    val nums2 = IntArray(size2)
    for (index in nums2.indices) {
        print("Enter the value at index $index: ")
        nums2[index] = scanner.nextInt()
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.numberOfPairs(nums1, nums2, k)

    println("Total number of good pairs is $output")
}