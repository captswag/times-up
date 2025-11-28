package leetcode._163

import extentions.displayFormatted
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

    print("Enter the value of lower: ")
    val lower = scanner.nextInt()

    print("Enter the value of upper: ")
    val upper = scanner.nextInt()

    val solution = Solution()
    val output = solution.findMissingRanges(nums, lower, upper)

    output.displayFormatted()
}