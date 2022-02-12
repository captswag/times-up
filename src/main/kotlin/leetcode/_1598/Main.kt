package leetcode._1598

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the logs array: ")
    val size = scanner.nextInt()

    val logs = Array(size) { "" }
    for (index in logs.indices) {
        print("Enter the value at index $index: ")
        logs[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.minOperations(logs)

    println("The minimum number of operations to reach the root folder is: $output")
}