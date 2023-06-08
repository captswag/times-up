package leetcode._2395

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
    val output = solution.findSubarrays(nums)

    if (output) {
        println("There exists subarrays of length 2 with equal sum")
    } else {
        println("There are no subarrays of length 2 with equal sum")
    }
}