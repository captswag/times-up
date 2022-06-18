package leetcode._2190

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

    print("Enter the value of key: ")
    val key = scanner.nextInt()

    val solution = Solution()
    val output = solution.mostFrequent(nums, key)

    println("Most frequent number following key is: $output")
}