package leetcode._1652

import extentions.displayFormatted
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val code = IntArray(size)
    for (index in code.indices) {
        print("Enter the value at index $index: ")
        code[index] = scanner.nextInt()
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.decrypt(code, k)

    output.displayFormatted()
}