package leetcode._1909

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
    val output = solution.canBeIncreasing(nums)

    if (output) {
        println("The array can be strictly increasing by removing one index position")
    } else {
        println("The array cannot be strictly increasing by removing one index position")
    }
}