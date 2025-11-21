package leetcode._3687

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the IntArray: ")
    val size = scanner.nextInt()

    val daysLate = IntArray(size)
    for (index in daysLate.indices) {
        print("Enter the value at index $index: ")
        daysLate[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.lateFee(daysLate)

    println("Total penalty for all books is $output")
}