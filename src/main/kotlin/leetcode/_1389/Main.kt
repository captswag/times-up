package leetcode._1389

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (i in nums.indices) {
        print("Enter the value at index $i: ")
        nums[i] = scanner.nextInt()
    }

    val index = IntArray(size)
    for (i in index.indices) {
        print("Enter the value at index $i: ")
        index[i] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.createTargetArray(nums, index)

    output.displayFormatted()
}