package leetcode._860

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val bills = IntArray(size)
    for (index in bills.indices) {
        print("Enter the value at index $index: ")
        bills[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.lemonadeChange(bills)

    if (output) {
        println("The shop keeper can provide every customer with the correct change")
    } else {
        println("The shop keeper cannot provide every customer with the correct change")
    }
}