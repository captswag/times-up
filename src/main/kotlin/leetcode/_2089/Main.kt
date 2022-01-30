package leetcode._2089

import extentions.displayFormatted
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

    print("Enter the target value: ")
    val target = scanner.nextInt()

    val solution = Solution()
    val output = solution.targetIndices(nums, target)

    output.displayFormatted()
}