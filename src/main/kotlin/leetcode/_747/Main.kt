package leetcode._747

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
    val output = solution.dominantIndex(nums)

    if (output == -1) {
        println("There is no large element in the array")
    } else {
        println("The largest element is at index: $output")
    }
}