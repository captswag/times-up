package leetcode._1431

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the candies array: ")
    val size = scanner.nextInt()

    val candies = IntArray(size)
    for (index in candies.indices) {
        print("Enter the value at index $index: ")
        candies[index] = scanner.nextInt()
    }

    print("Enter the extra candies that you have: ")
    val extraCandies = scanner.nextInt()

    val solution = Solution()
    val output = solution.kidsWithCandies(candies, extraCandies)

    output.displayFormatted()
}