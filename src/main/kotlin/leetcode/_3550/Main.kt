package leetcode._3550

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
    val output = solution.smallestIndex(nums)

    if (output == -1) {
        println("No index satisfies the condition")
    } else {
        println("Index $output is the smallest")
    }
}