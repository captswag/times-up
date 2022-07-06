package leetcode._1933

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string: ")
    val s = scanner.next()

    val solution = Solution()
    val output = solution.isDecomposable(s)

    if (output) {
        println("The string is decomposable")
    } else {
        println("The string is not decomposable")
    }
}