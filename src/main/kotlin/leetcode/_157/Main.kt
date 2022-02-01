package leetcode._157

import extentions.display
import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the input file contents: ")
    val file = scanner.nextLine()

    print("Enter the value of n: ")
    val n = scanner.nextInt()

    val buf = CharArray(file.length)

    val solution = Solution()
    solution.file = file
    val output = solution.read(buf, n)

    println("The length of the file that's read is: $output")
    buf.display()
}