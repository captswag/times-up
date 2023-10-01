package leetcode._2848

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Enter the number of cars: ")
    val size = scanner.nextInt()

    val nums = mutableListOf<List<Int>>()
    for (car in 0 until size) {
        println("Car: $car")
        print("Enter the start coordinate: ")
        val start = scanner.nextInt()
        print("Enter the end coordinate: ")
        val end = scanner.nextInt()
        nums.add(listOf(start, end))
    }

    val solution = Solution()
    val output = solution.numberOfPoints(nums)

    println("The number of integer points on the line that are covered with any part of a car is: $output")
}