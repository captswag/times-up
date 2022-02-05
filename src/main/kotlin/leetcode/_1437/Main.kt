package leetcode._1437

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

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.kLengthApart(nums, k)

    if (output) {
        println("Each of the 1s are at least k places apart")
    } else {
        println("Each of the 1s are not at least k places apart")
    }
}