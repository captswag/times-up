package leetcode._66

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val digits = IntArray(size)
    for (index in digits.indices) {
        digits[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.plusOne(digits)

    output.displayFormatted()
}