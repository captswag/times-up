package leetcode._1720

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val encoded = IntArray(size)
    for (index in encoded.indices) {
        print("Enter the value at index $index: ")
        encoded[index] = scanner.nextInt()
    }

    print("Enter the first value: ")
    val first = scanner.nextInt()

    val solution = Solution()
    val output = solution.decode(encoded, first)

    output.displayFormatted()
}