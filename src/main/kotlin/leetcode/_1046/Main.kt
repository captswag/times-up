package leetcode._1046

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val stones = IntArray(size)
    for (index in stones.indices) {
        print("Enter the value at index $index: ")
        stones[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.lastStoneWeight(stones)

    println("Last stone weight is: $output")
}