package leetcode._3285

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the height array: ")
    val size = scanner.nextInt()

    val height = IntArray(size)
    for (index in height.indices) {
        print("Enter the value at index $index: ")
        height[index] = scanner.nextInt()
    }

    print("Enter the value of threshold: ")
    val threshold = scanner.nextInt()

    val solution = Solution()
    val output = solution.stableMountains(height, threshold)

    output.displayFormatted()
}