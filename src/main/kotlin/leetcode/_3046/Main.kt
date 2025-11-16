package leetcode._3046

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
    val output = solution.isPossibleToSplit(nums)

    if (output) {
        println("It is possible to split the array")
    } else {
        println("It is not possible to split the array")
    }
}