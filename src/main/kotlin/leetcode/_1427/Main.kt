package leetcode._1427

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the string s: ")
    val s = scanner.next()

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val shift = Array(size) { IntArray(2) }
    for (index in shift.indices) {
        print("Enter the direction: ")
        val direction = scanner.nextInt()
        print("Enter the amount: ")
        val amount = scanner.nextInt()
        shift[index] = intArrayOf(direction, amount)
    }

    val solution = Solution()
    val output = solution.stringShift(s, shift)

    println("Final string after performing string shift is $output")
}