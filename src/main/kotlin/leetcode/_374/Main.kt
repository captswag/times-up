package leetcode._374

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of n (upper bound): ")
    val n = scanner.nextInt()

    val solution = Solution()
    solution.choseRandom(n)
    val output = solution.guessNumber(n)

    println("The number you scanned for is: $output")
}