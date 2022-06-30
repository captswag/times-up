package leetcode._2299

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the password: ")
    val password = scanner.next()

    val solution = Solution()
    val output = solution.strongPasswordCheckerII(password)

    if (output) {
        println("$password is a strong password")
    } else {
        println("$password is not a strong password")
    }
}