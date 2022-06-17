package leetcode._2224

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the current time: ")
    val current = scanner.next()

    print("Enter the correct time: ")
    val correct = scanner.next()

    val solution = Solution()
    val output = solution.convertTime(current, correct)

    println("The minimum number of operations to convert $current to $correct is: $output")
}