package leetcode._2798

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of employees: ")
    val size = scanner.nextInt()

    val hours = IntArray(size)
    for (index in hours.indices) {
        print("Number of hours worked by employee $index: ")
        hours[index] = scanner.nextInt()
    }

    print("Enter the target: ")
    val target = scanner.nextInt()

    val solution = Solution()
    val output = solution.numberOfEmployeesWhoMetTarget(hours, target)

    println("Number of employees who worked at least $target hours are: $output")
}