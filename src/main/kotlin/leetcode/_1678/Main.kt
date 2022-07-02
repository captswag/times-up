package leetcode._1678

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the command: ")
    val command = scanner.next()

    val solution = Solution()
    val output = solution.interpret(command)

    println("$command after parsing is: $output")
}