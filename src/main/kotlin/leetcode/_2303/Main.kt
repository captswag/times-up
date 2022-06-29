package leetcode._2303

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val brackets = Array(size) { IntArray(2) }
    for (index in brackets.indices) {
        println("Index: $index")
        print("Enter the value of upper: ")
        brackets[index][0] = scanner.nextInt()
        print("Enter the value of percent: ")
        brackets[index][1] = scanner.nextInt()
    }

    print("Enter the income: ")
    val income = scanner.nextInt()

    val solution = Solution()
    val output = solution.calculateTax(brackets, income)

    println("The total tax paid is: $output")
}