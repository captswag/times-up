package leetcode._1945

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.getLucky(s, k)

    println("The sum of digits is: $output")
}