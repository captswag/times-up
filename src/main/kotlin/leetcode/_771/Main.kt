package leetcode._771

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the value of jewels: ")
    val jewels = scanner.next()

    print("Enter the value of stones: ")
    val stones = scanner.next()

    val solution = Solution()
    val output = solution.numJewelsInStones(jewels, stones)

    println("The number of jewels you have is: $output")
}