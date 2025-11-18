package leetcode._3131

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArrays: ")
    val size = scanner.nextInt()

    val nums1 = IntArray(size)
    for (index in nums1.indices) {
        print("Enter the value at index $index: ")
        nums1[index] = scanner.nextInt()
    }

    val nums2 = IntArray(size)
    for (index in nums2.indices) {
        print("Enter the value at index $index: ")
        nums2[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.addedInteger(nums1, nums2)

    println("The integer added to each element of nums1 is $output")
}