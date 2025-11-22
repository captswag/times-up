package leetcode._2951

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val mountain = IntArray(size)
    for (index in mountain.indices) {
        print("Enter the value at index $index: ")
        mountain[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.findPeaks(mountain)

    output.displayFormatted()
}