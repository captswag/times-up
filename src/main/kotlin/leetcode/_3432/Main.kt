package leetcode._3432

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.countPartitions(nums)

    println("Number of partitions where the difference between the sum of the left and right subarrays is even is $output")
}