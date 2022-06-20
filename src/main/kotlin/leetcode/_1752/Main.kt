package leetcode._1752

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.check(nums)

    if (output) {
        println("The array is sorted and rotated")
    } else {
        println("The array is not sorted and rotated")
    }
}