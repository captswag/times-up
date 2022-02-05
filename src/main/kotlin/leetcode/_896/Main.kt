package leetcode._896

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
    val output = solution.isMonotonic(nums)

    if (output) {
        println("The given array is monotonic")
    } else {
        println("The given array is not monotonic")
    }
}