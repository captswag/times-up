package leetcode._1176

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the size: ")
    val size = scanner.nextInt()

    val calories = IntArray(size)
    for (index in calories.indices) {
        print("Enter the value at index $index: ")
        calories[index] = scanner.nextInt()
    }

    print("Enter the value of k: ")
    val k = scanner.nextInt()

    print("Enter the lower value: ")
    val lower = scanner.nextInt()

    print("Enter the upper value: ")
    val upper = scanner.nextInt()

    val solution = Solution()
    val output = solution.dietPlanPerformance(calories, k, lower, upper)

    println("Total points: $output")
}