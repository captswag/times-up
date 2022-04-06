package leetcode._2057

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val nums = IntArray(size)
    for (index in 0 until size) {
        print("Enter the number at index $index: ")
        nums[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.smallestEqual(nums)

    println("Smallest equal: $output")
}