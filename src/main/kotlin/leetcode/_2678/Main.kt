package leetcode._2678

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size of the array: ")
    val size = scanner.nextInt()

    val details = Array(size) { "" }
    for (index in details.indices) {
        print("Enter the value at index $index: ")
        details[index] = scanner.next()
    }

    val solution = Solution()
    val output = solution.countSeniors(details)

    println("The number of passengers who are strictly more than 60 years old are: $output")
}