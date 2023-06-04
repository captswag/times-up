package leetcode._575

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val candyType = IntArray(size)
    for (index in candyType.indices) {
        print("Enter the value at index $index: ")
        candyType[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.distributeCandies(candyType)

    println("The maximum number of different types of candies Alice can eat is: $output")
}