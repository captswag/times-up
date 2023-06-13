package leetcode._2644

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the nums array: ")
    val numsSize = scanner.nextInt()

    val nums = IntArray(numsSize)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    print("Enter the size of the divisors array: ")
    val divisorsSize = scanner.nextInt()

    val divisors = IntArray(divisorsSize)
    for (index in divisors.indices) {
        print("Enter the value at index $index: ")
        divisors[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.maxDivScore(nums, divisors)

    println("Integer with maximum divisibility score is: $output")
}