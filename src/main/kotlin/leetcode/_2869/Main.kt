package leetcode._2869

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the nums list: ")
    val size = scanner.nextInt()

    val nums = mutableListOf<Int>()
    for (index in 0 until size) {
        print("Enter the value at index $index: ")
        nums.add(scanner.nextInt())
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.minOperations(nums, k)

    println("Minimum number of operations needed is: $output")
}