package leetcode._1

import extentions.displayFormatted
import java.lang.System.`in`
import java.util.*

fun main() {
    val scanner = Scanner(`in`)
    print("Enter the length of the array: ")
    val length = scanner.nextInt()

    val nums = IntArray(length)
    for (index in nums.indices) {
        print("Enter the value at index $index: ")
        nums[index] = scanner.nextInt()
    }

    print("Enter the value of target: ")
    val target = scanner.nextInt()

    val solution = Solution()
    val output = solution.twoSum(nums, target)
    output.displayFormatted()
}