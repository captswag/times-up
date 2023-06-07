package leetcode._2335

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    val amount = IntArray(3)
    for (index in amount.indices) {
        print("Enter the value in index $index: ")
        amount[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.fillCups(amount)

    println("Minimum amount of time to fill cups is: $output")
}