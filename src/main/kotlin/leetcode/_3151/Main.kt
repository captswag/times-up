package leetcode._3151

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
    val output = solution.isArraySpecial(nums)

    if (output) {
        println("The given array is a special array")
    } else {
        println("The given array is not a special array")
    }
}