package leetcode._1491

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val salary = IntArray(size)
    for (index in salary.indices) {
        print("Enter the value at index $index: ")
        salary[index] = scanner.nextInt()
    }

    val solution = Solution()
    val output = solution.average(salary)

    println("The average salary is: $output")
}