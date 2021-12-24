package leetcode._27

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the element at index $index: ")
        nums[index] = scanner.nextInt()
    }

    print("Enter the number to be removed: ")
    val `val` = scanner.nextInt()

    val solution = Solution()
    val output = solution.removeElement(nums, `val`)

    print("The output is: $output")
}