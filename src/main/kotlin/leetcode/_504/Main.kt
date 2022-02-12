package leetcode._504

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number: ")
    val num = scanner.nextInt()

    val solution = Solution()
    val output = solution.convertToBase7(num)

    println("The base 7 representation of $num is: $output")
}