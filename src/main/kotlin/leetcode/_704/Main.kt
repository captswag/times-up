package leetcode._704

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in nums.indices) {
        print("Enter the element at index $index: ")
        nums[index] = scanner.nextInt()
    }

    print("Enter the target value: ")
    val target = scanner.nextInt()

    val solution = Solution()
    val output = solution.search(nums, target)

    println("Output of the binary search: $output")
}