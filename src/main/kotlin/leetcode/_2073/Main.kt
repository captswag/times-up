package leetcode._2073

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val tickets = IntArray(size)
    for (index in tickets.indices) {
        print("Enter the value at index $index: ")
        tickets[index] = scanner.nextInt()
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    val solution = Solution()
    val output = solution.timeRequiredToBuy(tickets, k)

    println("Time taken for the position $k: $output")
}