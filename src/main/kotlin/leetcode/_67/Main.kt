package leetcode._67

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter first binary number: ")
    val a = scanner.next()

    print("Enter second binary number: ")
    val b = scanner.next()

    val solution = Solution()
    val output = solution.addBinary(a, b)

    println("The sum of two binary numbers is: $output")
}