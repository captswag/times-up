package leetcode._219

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

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.containsNearbyDuplicate(nums, k)

    if (output) {
        println("The given array contains duplicates")
    } else {
        println("The given array doesn't contain any duplicates")
    }
}