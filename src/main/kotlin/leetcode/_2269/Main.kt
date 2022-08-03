package leetcode._2269

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of num: ")
    val num = scanner.nextInt()

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.divisorSubstrings(num, k)

    println("The K-Beauty of the number is: $output")
}