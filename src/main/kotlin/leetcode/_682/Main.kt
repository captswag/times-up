package leetcode._682

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the ops array: ")
    val size = scanner.nextInt()

    val ops = Array(size) { "" }
    for (index in ops.indices) {
        print("Enter the value at index $index: ")
        ops[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.calPoints(ops)

    println("The total score of the baseball game is: $output")
}