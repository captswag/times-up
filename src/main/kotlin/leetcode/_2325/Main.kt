package leetcode._2325

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the key: ")
    val key = scanner.nextLine()

    print("Enter the message: ")
    val message = scanner.nextLine()

    val solution = Solution()
    val output = solution.decodeMessage(key, message)

    println("Decoded message is: $output")
}