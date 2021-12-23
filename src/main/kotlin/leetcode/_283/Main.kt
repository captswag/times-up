package leetcode._283

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the length of the array: ")
    val length = scanner.nextInt()

    val nums = IntArray(length)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    solution.moveZeroes(nums)
}