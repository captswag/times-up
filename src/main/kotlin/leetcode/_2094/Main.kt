package leetcode._2094

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val digits = IntArray(size)
    for (index in digits.indices) {
        print("Enter the value at index $index: ")
        digits[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.findEvenNumbers(digits)

    output.displayFormatted()
}