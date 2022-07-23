package leetcode._1441

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val target = IntArray(size)
    for (index in target.indices) {
        print("Enter the value at index $index: ")
        target[index] = scanner.nextInt()
    }

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val solution = Solution()
    val output = solution.buildArray(target, n)

    output.displayFormatted()
}